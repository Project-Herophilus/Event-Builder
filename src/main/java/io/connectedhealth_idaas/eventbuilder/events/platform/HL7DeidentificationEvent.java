package io.connectedhealth_idaas.eventbuilder.events.platform;

import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.DeIdentification;
import io.connectedhealth_idaas.eventbuilder.parsers.hl7v2x.HL7DeidentificationParser;

public class HL7DeidentificationEvent {

    public static DeIdentification processHL7Deidentify(String body)
    {
        DeIdentification deIdent = new DeIdentification();
        deIdent = HL7DeidentificationParser.processHL7DataForDeidentifcation(body);
        return deIdent;
    }

}
