package io.connectedhealth.idaas.eventbuilder.events.platform;

import com.google.gson.Gson;
import io.connectedhealth.idaas.eventbuilder.parsers.fhir.FHIRResourceParser;
import io.connectedhealth.idaas.eventbuilder.parsers.fhir.FHIRTerminologyParser;
import io.connectedhealth.idaas.hcdataobjects.common.Coding;
import io.connectedhealth.idaas.hcdataobjects.common.AllergyIntolerance;
import io.connectedhealth.idaas.hcdataobjects.platform.MessageHeader;
import io.connectedhealth.idaas.hcdataobjects.general.Codeset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class FHIRTerminologyProcessorEvent {

    public List<Codeset> fhirBuildTermsForProcessingToObjects (String fhirResourceName, String body){
        Gson gson = new Gson();
        MessageHeader mshHeader = new MessageHeader();
        Codeset cpEvent = new Codeset();
        AllergyIntolerance allergy = gson.fromJson(body, AllergyIntolerance.class);
        //Instantiate Structures and Events
        List<Codeset> terminologyCodes = new ArrayList<Codeset>();
        terminologyCodes = FHIRTerminologyParser.fhirParseTermsForProcessingToObject(fhirResourceName, body);
        return terminologyCodes;
    }
    public String fhirBuildTermsForProcessingToJSON (String fhirResourceName, String body){
        Gson gson = new Gson();
        MessageHeader mshHeader = new MessageHeader();
        Codeset cpEvent = new Codeset();
        AllergyIntolerance allergy = gson.fromJson(body, AllergyIntolerance.class);
        //Instantiate Structures and Events
        String terminologyCodes = FHIRTerminologyParser.fhirParseTermsForProcessingToJSON(fhirResourceName, body);
        final Map<String, Object> response = new HashMap<>();
        response.put("header", mshHeader);
        response.put("terminologies", terminologyCodes);
        return new Gson().toJson(terminologyCodes);
    }

    public String fhirBuildTermsForProcessing2 (String fhirResourceName, String body){
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
        // Manifestation manifestation = gson.fromJson(body, Manifestation.class);
        // Reaction reaction = gson.fromJson(body, Reaction.class);
        //for each coding attribute parsing
        ListIterator<Coding> codingListIterator = allergy.getCode().getCoding().listIterator();
        while(codingListIterator.hasNext())
        {
            // Per Code
            String codeDataLocation = "medication.coding";
            Coding codeData = codingListIterator.next();
            cpEvent.setApplicationName(mshHeader.getSendingApp());
            cpEvent.setIndustryStd(mshHeader.getIndustryStd());
            // returned from the current codeset data being processed
            cpEvent.setDisplayName(codeData.getDisplay());
            cpEvent.setCodeSystemID(codeData.getSystem());
            cpEvent.setCodeSystemID(codeData.getSystem());
            cpEvent.setCodeValue(codeData.getCode());
            cpEvent.setCodeValue(codeData.getCode());
            cpEvent.setCodeDataLocation(codeDataLocation);
            // cpEvent.setCodeSystemID(codeData.getExtension().toString());
            terminologyCodes.add(cpEvent);
        }
        ListIterator<Coding> codingListIterator1 = allergy.getVerificationStatus().getCoding().listIterator();
        while(codingListIterator1.hasNext())
        {
            // Per Code
            String codeDataLocation = "verificationStatus.Coding";
            Coding codeData = codingListIterator1.next();
            cpEvent2.setApplicationName(mshHeader.getSendingApp());
            cpEvent2.setIndustryStd(mshHeader.getIndustryStd());
            // returned from the current codeset data being processed
            cpEvent2.setDisplayName(codeData.getDisplay());
            cpEvent2.setCodeSystemID(codeData.getSystem());
            cpEvent2.setCodeSystemID(codeData.getSystem());
            cpEvent2.setCodeValue(codeData.getCode());
            cpEvent.setCodeDataLocation(codeDataLocation);
            // cpEvent.setCodeSystemID(codeData.getExtension().toString());
            terminologyCodes.add(cpEvent2);
        }
        ListIterator<Coding> codingListIterator2= allergy.getClinicalStatus().getCoding().listIterator();
        while(codingListIterator2.hasNext())
        {
            // Per Code
            String codeDataLocation = "clinicalStatus.coding";
            Coding codeData = codingListIterator2.next();
            cpEvent3.setApplicationName(mshHeader.getSendingApp());
            cpEvent3.setIndustryStd(mshHeader.getIndustryStd());
            // returned from the current codeset data being processed
            cpEvent3.setDisplayName(codeData.getDisplay());
            cpEvent3.setCodeSystemID(codeData.getSystem());
            cpEvent3.setCodeSystemID(codeData.getSystem());
            cpEvent3.setCodeValue(codeData.getCode());
            cpEvent.setCodeDataLocation(codeDataLocation);
            // cpEvent.setCodeSystemID(codeData.getExtension().toString());
            terminologyCodes.add(cpEvent3);
        }
        final Map<String, Object> response = new HashMap<>();
        response.put("header", mshHeader);
        response.put("terminologies", terminologyCodes);
        return new Gson().toJson(response);
    }
}
