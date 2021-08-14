package io.connectedhealth_idaas.eventbuilder.parsers.edi;

public class EDIClaimsParser {

    public String[] returnEDISegments(String msgBody) {
        String[] ediSegments;
        ediSegments = msgBody.split(SegmentConstants.DEFAULT_SEGMENT_DELIMITER);
        return ediSegments;
    }

    public String[] returnEDISegmentFields(String msgSegment) {
        String[] ediSegmentField;
        ediSegmentField = msgSegment.split(SegmentConstants.DEFAULT_FIELD_DELIMITER);
        return ediSegmentField;
    }

}
