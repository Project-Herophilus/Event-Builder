package io.connectedhealth_idaas.eventbuilder.parsers.fhir;

import com.google.gson.Gson;
import io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common.Coding;
import io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.resources.AllergyIntolerance;
import io.connectedhealth_idaas.eventbuilder.dataobjects.general.Codeset;
import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.MessageHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FHIRTerminologyParser {

    public static List<Codeset> fhirParseTermsForProcessingToObject(String fhirResourceName, String body){
        Gson gson = new Gson();
        //Instantiate Structures and Events
        List<Codeset> terminologyCodes = new ArrayList<Codeset>();
        MessageHeader mshHeader = new MessageHeader();
        Codeset cpEvent = new Codeset();
        // Invoke Parser and Build Message Header
        mshHeader = FHIRResourceParser.parseFHIRMessageToMesseageHeader(fhirResourceName, body);
        // Create Terminology Event and populate object
        // Goal Here would be to pass in detailed resource and not have to do if logic
        AllergyIntolerance allergy = gson.fromJson(body, AllergyIntolerance.class);

        if(fhirResourceName.equals("AllergyIntolerence")) {
            //for each coding attribute parsing
            ListIterator<Coding> codingListIterator = allergy.getCode().getCoding().listIterator();
            while (codingListIterator.hasNext()) {
                // Per Code
                Coding codeData = codingListIterator.next();
                cpEvent.setApplicationName(mshHeader.getSendingApp());
                cpEvent.setIndustryStd(mshHeader.getIndustryStd());
                // returned from the current codeset data being processed
                cpEvent.setDisplayName(codeData.getDisplay());
                cpEvent.setCodeSystemID(codeData.getSystem());
                cpEvent.setCodeSystemID(codeData.getSystem());
                cpEvent.setCodeValue(codeData.getCode());
                // cpEvent.setCodeSystemID(codeData.getExtension().toString());
                terminologyCodes.add(cpEvent);
            }
        }
        // Return Object Representation
        return terminologyCodes;
    }

    public static String fhirParseTermsForProcessingToJSON(String fhirResourceName, String body){
        Gson gson = new Gson();
        //Instantiate Structures and Events
        List<Codeset> terminologyCodes = new ArrayList<Codeset>();
        MessageHeader mshHeader = new MessageHeader();
        Codeset cpEvent = new Codeset();
        Codeset cpEvent2 = new Codeset();
        Codeset cpEvent3 = new Codeset();
        // Invoke Parser and Build Message Header
        mshHeader = FHIRResourceParser.parseFHIRMessageToMesseageHeader(fhirResourceName, body);
        // Create Terminology Event and populate object
        // Goal Here would be to pass in detailed resource and not have to do if logic
        AllergyIntolerance allergy = gson.fromJson(body, AllergyIntolerance.class);
        if(fhirResourceName.equals("AllergyIntolerence"))
        {
            // Manifestation manifestation = gson.fromJson(body, Manifestation.class);
            // Reaction reaction = gson.fromJson(body, Reaction.class);
            //for each coding attribute parsing
            ListIterator<Coding> codingListIterator = allergy.getCode().getCoding().listIterator();
            while(codingListIterator.hasNext())
            {
                // Per Code
                Coding codeData = codingListIterator.next();
                cpEvent.setApplicationName(mshHeader.getSendingApp());
                cpEvent.setIndustryStd(mshHeader.getIndustryStd());
                // returned from the current codeset data being processed
                cpEvent.setDisplayName(codeData.getDisplay());
                cpEvent.setCodeSystemID(codeData.getSystem());
                cpEvent.setCodeSystemID(codeData.getSystem());
                cpEvent.setCodeValue(codeData.getCode());
                // cpEvent.setCodeSystemID(codeData.getExtension().toString());
                terminologyCodes.add(cpEvent);
            }
            ListIterator<Coding> codingListIterator1 = allergy.getVerificationStatus().getCoding().listIterator();
            while(codingListIterator1.hasNext())
            {
                // Per Code
                Coding codeData = codingListIterator1.next();
                cpEvent2.setApplicationName(mshHeader.getSendingApp());
                cpEvent2.setIndustryStd(mshHeader.getIndustryStd());
                // returned from the current codeset data being processed
                cpEvent2.setDisplayName(codeData.getDisplay());
                cpEvent2.setCodeSystemID(codeData.getSystem());
                cpEvent2.setCodeSystemID(codeData.getSystem());
                cpEvent2.setCodeValue(codeData.getCode());
                // cpEvent.setCodeSystemID(codeData.getExtension().toString());
                terminologyCodes.add(cpEvent2);
            }
            ListIterator<Coding> codingListIterator2= allergy.getClinicalStatus().getCoding().listIterator();
            while(codingListIterator2.hasNext())
            {
                // Per Code
                Coding codeData = codingListIterator2.next();
                cpEvent3.setApplicationName(mshHeader.getSendingApp());
                cpEvent3.setIndustryStd(mshHeader.getIndustryStd());
                // returned from the current codeset data being processed
                cpEvent3.setDisplayName(codeData.getDisplay());
                cpEvent3.setCodeSystemID(codeData.getSystem());
                cpEvent3.setCodeSystemID(codeData.getSystem());
                cpEvent3.setCodeValue(codeData.getCode());
                // cpEvent.setCodeSystemID(codeData.getExtension().toString());
                terminologyCodes.add(cpEvent3);
            }
        }

        // Return JSON Object Representation
        return new Gson().toJson(terminologyCodes);
    }
}
