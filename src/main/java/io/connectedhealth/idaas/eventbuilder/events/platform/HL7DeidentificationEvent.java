package io.connectedhealth.idaas.eventbuilder.events.platform;

import io.connectedhealth.idaas.eventbuilder.parsers.hl7v2x.HL7DeidentificationParser;
import io.connectedhealth.idaas.hcdataobjects.platform.DeIdentification;

public class HL7DeidentificationEvent {

    public static DeIdentification processHL7Deidentify(String body)
    {
        DeIdentification deIdent = new DeIdentification();
        deIdent = HL7DeidentificationParser.processHL7DataForDeidentifcation(body);
        return deIdent;
    }

}
