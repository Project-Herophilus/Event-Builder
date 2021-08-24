package io.connectedhealth_idaas.eventbuilder.events.platform;

import com.google.gson.Gson;
import io.connectedhealth_idaas.eventbuilder.builders.hl7.common.HL7SegmentConstants;
import io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.resources.AllergyIntolerance;
import io.connectedhealth_idaas.eventbuilder.dataobjects.general.Codeset;
import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.MessageHeader;
import io.connectedhealth_idaas.eventbuilder.parsers.fhir.FHIRResourceParser;
import io.connectedhealth_idaas.eventbuilder.parsers.fhir.FHIRTerminologyParser;
import io.connectedhealth_idaas.eventbuilder.parsers.hl7v2x.HL7TerminologyParser;

import java.util.ArrayList;
import java.util.List;

public class HL7TerminologyProcessorEvent {

    public List<Codeset> hl7BuildTermsForProcessingToObjects (String body){
        MessageHeader mshHeader = new MessageHeader();
        Codeset cpEvent = new Codeset();
        // Goal Here would be to pass in detailed resource and not have to do if logic
        List<Codeset> terminologyCodes = new ArrayList<Codeset>();
        terminologyCodes = HL7TerminologyParser.hl7ParseTermsForProcessingToObject(body);
        return terminologyCodes;
    }
    public String hl7BuildTermsForProcessingToJSON (String fhirResourceName, String body){
        Gson gson = new Gson();
        MessageHeader mshHeader = new MessageHeader();
        Codeset cpEvent = new Codeset();
        // Goal Here would be to pass in detailed resource and not have to do if logic
        List<Codeset> terminologyCodes = new ArrayList<Codeset>();
        terminologyCodes = HL7TerminologyParser.hl7ParseTermsForProcessingToObject(body);
        return new Gson().toJson(terminologyCodes);
    }
}
