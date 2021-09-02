package io.connectedhealth_idaas.eventbuilder.parsers.hl7v2x;

import com.google.gson.Gson;


import io.connectedhealth_idaas.eventbuilder.builders.hl7.common.HL7SegmentConstants;
import io.connectedhealth_idaas.eventbuilder.dataobjects.general.Codeset;
import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.MessageHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HL7TerminologyParser {
    private static final Logger LOG = LoggerFactory.getLogger(HL7TerminologyParser.class);

    public static List<Codeset> hl7ParseTermsForProcessing(String body){
        //Variables
        //String componentDelimiter = "['+HL7SegmentConstants.DEFAULT_SUBFIELD_DELIMITER+']";
        //Instantiate Structures and Events
        List<Codeset> terminologyCodes = new ArrayList<Codeset>();
        // Create Terminology Event and populate object
        String[] messageSegments = body.split(HL7SegmentConstants.DEFAULT_SEGMENT_DELIMITER);
        for (int i=0; i< messageSegments.length; i++) {
           // Will need to define application and Org Logic to pair down artifact matches these code from
          //  mshHeader

            if (messageSegments[i].toString().substring(0,3).equals("AL1")) {
                Codeset cpEvent = new Codeset();
                String segmentData = messageSegments[i].toString();
                // One Per item - Should have a look up against the refdata_codeset values
                String[] al1SegmentData = segmentData.split("[" + HL7SegmentConstants.DEFAULT_FIELD_DELIMITER + "]");
                // Per Code
                // TODO pass from in-memory configuration
                cpEvent.setCodeDataLocation("AL1.3");
                // Push Specific code to string
                String allergySpecificDetail = al1SegmentData[3].toString();
                // Parse String
                // String[] allergyCodeDesc = allergySpecificDetail.split(componentDelimiter);
                String[] allergyCodeDetail = al1SegmentData[3].toString().split("['^']");
                cpEvent.setCodeValue(allergyCodeDetail[0].toString());
                cpEvent.setDisplayName(allergyCodeDetail[1].toString());
                terminologyCodes.add(cpEvent);
            }
        }
        // Return Object Representation
        return terminologyCodes;
    }
}
