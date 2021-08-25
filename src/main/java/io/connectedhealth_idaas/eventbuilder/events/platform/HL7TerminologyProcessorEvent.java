package io.connectedhealth_idaas.eventbuilder.events.platform;

import com.google.gson.Gson;
import io.connectedhealth_idaas.eventbuilder.dataobjects.general.Codeset;
import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.MessageHeader;
import io.connectedhealth_idaas.eventbuilder.parsers.hl7v2x.HL7TerminologyParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HL7TerminologyProcessorEvent {

    public List<Codeset> hl7BuildTermsForProcessingToObjects (String body){
        MessageHeader mshHeader = new MessageHeader();
        Codeset cpEvent = new Codeset();
        // Goal Here would be to pass in detailed resource and not have to do if logic
        List<Codeset> terminologyCodes = new ArrayList<Codeset>();
        terminologyCodes = HL7TerminologyParser.hl7ParseTermsForProcessing(body);
        return terminologyCodes;
    }
    public String hl7BuildTermsForProcessingToJSON (String fhirResourceName, String body){
        MessageHeader mshHeader = new MessageHeader();
        // Goal Here would be to pass in detailed resource and not have to do if logic
        List<Codeset> terminologyCodes = new ArrayList<Codeset>();
        terminologyCodes = HL7TerminologyParser.hl7ParseTermsForProcessing(body);
        final Map<String, Object> response = new HashMap<>();
        response.put("header", mshHeader);
        response.put("terminologies", terminologyCodes);
        return new Gson().toJson(terminologyCodes);

    }
}
