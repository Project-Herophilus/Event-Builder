package io.connectedhealth.idaas.eventbuilder.events.platform;

import com.google.gson.Gson;
import io.connectedhealth.idaas.eventbuilder.parsers.hl7v2x.HL7Parser;
import io.connectedhealth.idaas.eventbuilder.parsers.hl7v2x.HL7TerminologyParser;
import io.connectedhealth.idaas.hcdataobjects.general.Codeset;
import io.connectedhealth.idaas.hcdataobjects.platform.MessageHeader;

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
        // Invoke Parser and Build Message Header
        mshHeader = HL7Parser.parseHL7MessageToMessageHeader(body);
        List<Codeset> terminologyCodes = new ArrayList<Codeset>();
        terminologyCodes = HL7TerminologyParser.hl7ParseTermsForProcessing(body);
        final Map<String, Object> response = new HashMap<>();
        response.put("header", mshHeader);
        response.put("terminologies", terminologyCodes);
        return new Gson().toJson(response);

    }
}
