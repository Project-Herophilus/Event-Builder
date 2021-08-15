package io.connectedhealth_idaas.eventbuilder.events.platform;

import io.connectedhealth_idaas.eventbuilder.parsers.fhir.FHIRResourceParser;
import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.RoutingEvent;
import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.MessageHeader;

public class FHIRRoutingEvent {

    public RoutingEvent fhirRoutingEvent (String fhirResourceName, String body){
        //Instantiate Structures and Events
        MessageHeader mshHeader = new MessageHeader();
        RoutingEvent routingEvent = new RoutingEvent();
        // Invoke Parser and Build Message Header
        mshHeader = FHIRResourceParser.parseFHIRMessageToMesseageHeader(fhirResourceName, body);
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

   // Old Implementation merely saved for reference
   /* public RoutingEvent buildRoutingEvent (String body){
        RoutingEvent routingEvent = new RoutingEvent();
        Gson gson = new Gson();
        AllergyIntolerance allergy = new AllergyIntolerance();
        UUID uuid = UUID.randomUUID();
        String uuidstr = uuid.toString();
        allergy = gson.fromJson(body, AllergyIntolerance.class);
        String messageTypeData = "AllergyIntolerence";
        String messageSendingDate = allergy.getRecordedDate();
        String messageSendingHour = allergy.getRecordedDate().substring(11, 13);
        String messageTime = allergy.getRecordedDate().substring(11, 19);

        String facilityId = allergy.getId();
        String resourceType = allergy.getResourceType();
        String messageEvent = allergy.getText().getStatus();
        List<Note> obj = allergy.getNote();
        String noteVal = obj.get(0).getText();
        routingEvent.setSendingApp(resourceType);
        routingEvent.setFacilityId(facilityId);
        routingEvent.setIndustryStd("FHIR");
        routingEvent.setMessageDateTime(messageSendingDate);
        routingEvent.setMessageDate(messageSendingDate);
        routingEvent.setMessageHour(messageSendingHour);
        routingEvent.setMessageTime(messageTime);
        routingEvent.setMessageType(resourceType);
        routingEvent.setMessageEvent(messageEvent);
        routingEvent.setMessageId(facilityId);
        routingEvent.setUniqueMessageId(uuidstr);
        routingEvent.setMessageVersion("V1");
        routingEvent.setMessageData(noteVal);

        return routingEvent;
    }*/
}
