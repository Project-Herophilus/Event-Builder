package io.connectedhealth_idaas.eventbuilder.events.platform;

import com.google.gson.Gson;
import io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common.Coding;
import io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.resources.AllergyIntolerance;
import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.MessageHeader;
import io.connectedhealth_idaas.eventbuilder.parsers.fhir.FHIRResourceParser;
import io.connectedhealth_idaas.eventbuilder.dataobjects.general.Codeset;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FHIRTerminologyProcessorEvent {

    public List<Codeset> fhirBuildTermsForProcessing (String fhirResourceName, String body){
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
            cpEvent.setCodeSystemID(codeData.getExtension().toString());
            boolean add;
            add = terminologyCodes.add(cpEvent);
        }
        return terminologyCodes;
    }
}
