package io.connectedhealth_idaas.eventbuilder.parsers.hl7v2x;

import io.connectedhealth_idaas.eventbuilder.builders.hl7.common.HL7SegmentConstants;
import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.DeIdentification;
import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.MessageHeader;

public class HL7DeidentificationParser {

    public static DeIdentification processHL7DataForDeidentifcation(String body) {
        MessageHeader mshHeader = new MessageHeader();
        DeIdentification deIdentificationRecord = new DeIdentification();

        // Invoke Parser and Build Message Header
        mshHeader = HL7Parser.parseHL7MessageToMessageHeader(body);
        // Create Terminology Event and populate object
        String[] messageSegments = body.split(HL7SegmentConstants.DEFAULT_SEGMENT_DELIMITER);
        for (int i = 0; i < messageSegments.length; i++) {
            // You will need to iterate through a segment and field list populated as follows:
            // IN1.1.2
            // This means the IN1 segment, 1 first and second element as split with normal HL7 message processing
            // look at the GeneralHL7ParserTest in the unit test for more details

            if (messageSegments[i].toString().substring(0, 3).equals("AL1"))
            {

            }
        }
        return deIdentificationRecord;
    }

    public static DeIdentification parseAL1(String body, DeIdentification deIdentificationRecord)
    {
        DeIdentification deIdentificationAL1 = new DeIdentification();

        return deIdentificationAL1;

    }
    public static void parseDG1(String body)
    {

    }
    public static void parseGT1(String body)
    {

    }
    public static void parsePV1(String body)
    {

    }
    public static void parsePID(String body)
    {

    }
    public static void parseIN1(String body)
    {

    }
    public static void parseOBX(String body)
    {

    }
    public static void parseNTE(String body)
    {

    }
    public static void parseIN2(String body)
    {

    }

}

