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
        //Instantiate Structures and Events
        List<Codeset> terminologyCodes = new ArrayList<Codeset>();
        MessageHeader mshHeader = new MessageHeader();
        Codeset cpEvent = new Codeset();
        // Invoke Parser and Build Message Header
        mshHeader = HL7Parser.parseHL7MessageToMessageHeader(body);
        // Create Terminology Event and populate object
        String[] messageSegments = body.split(HL7SegmentConstants.DEFAULT_SEGMENT_DELIMITER);

        for (int i=0; i< messageSegments.length; i++) {
           // Will need to define application and Org Logic to pair down artifact matches these code from
          //  mshHeader

            if (messageSegments[i].toString().substring(0,3).equals("AL1"))
            {
                String segmentData = messageSegments[i].toString();
                // One Per item - Should have a look up against the refdata_codeset values
                String[] allSegmentData = segmentData.split("["+HL7SegmentConstants.DEFAULT_FIELD_DELIMITER+"]");
                // Per Code
                // AL1|1|DA|TZ1^Thioridazine HCl^From MELLARIL|SV|rash|20210523
                //AL1-2 = al1SegmentData[2].toString();
                //AL1-3 = al1SegmentData[3].toString();
                cpEvent.setApplicationName(mshHeader.getSendingApp());
                cpEvent.setIndustryStd(mshHeader.getIndustryStd());
                String[] allergyCodeDetail = allSegmentData[3].toString().split("^");
                cpEvent.setDisplayName(allergyCodeDetail[0].toString().split("['^']")[1]);
//                cpEvent.setCodeSystemID(codeData.getSystem());
                cpEvent.setCodeValue(allergyCodeDetail[0].toString().split("['^']")[0]);
//                 cpEvent.setCodeSystemID(codeData.getExtension().toString());
                terminologyCodes.add(cpEvent);
            }
        }
        // Return Object Representation
        return terminologyCodes;
    }
}
