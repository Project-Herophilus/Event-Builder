package io.connectedhealth_idaas.eventbuilder.events.platform;

import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.MessageHeader;
import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.RoutingEvent;
import io.connectedhealth_idaas.eventbuilder.parsers.hl7v2x.HL7Parser;

public class HL7RoutingEvent {

    public RoutingEvent hl7RoutingEvent (String body){
        //Instantiate Structures and Events
        MessageHeader mshHeader = new MessageHeader();
        RoutingEvent routingEvent = new RoutingEvent();
        // Invoke Parser and Build Message Header
        mshHeader = HL7Parser.parseHL7MessageToMessageHeader(body);
        // Create Routing Event and populate object
        routingEvent.setSendingApp(mshHeader.getSendingApp());
        routingEvent.setFacilityId(mshHeader.getFacilityId());
        routingEvent.setIndustryStd(mshHeader.getIndustryStd());
        routingEvent.setMessageDateTime(mshHeader.getMessageDateTime());
        routingEvent.setMessageDate(mshHeader.getMessageDate());
        routingEvent.setMessageHour(mshHeader.getMessageHour());
        routingEvent.setMessageTime(mshHeader.getMessageTime());
        routingEvent.setMessageType(mshHeader.getMessageType());
        routingEvent.setMessageEvent(mshHeader.getMessageEvent());
        routingEvent.setMessageId(mshHeader.getMessageId());
        routingEvent.setUniqueMessageId(mshHeader.getUniqueMessageId());
        routingEvent.setMessageVersion(mshHeader.getMessageVersion());
        routingEvent.setMessageData(body);

        return routingEvent;
    }
}
