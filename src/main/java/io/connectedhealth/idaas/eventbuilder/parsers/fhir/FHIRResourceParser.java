package io.connectedhealth.idaas.eventbuilder.parsers.fhir;

//Common Imports
import io.connectedhealth.idaas.hcdataobjects.common.Encounter;
import io.connectedhealth.idaas.hcdataobjects.common.Patient;
import io.connectedhealth.idaas.hcdataobjects.platform.MessageHeader;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
// ConnectedHealth Imports
import io.connectedhealth.idaas.hcdataobjects.common.AllergyIntolerance;

/*
 * Designed to support general parsing of FHIR messages
 *
 */
public class FHIRResourceParser {

    private static final Logger LOG = LoggerFactory.getLogger(FHIRResourceParser.class);
    /*
     *   Return Generic Message Header based on FHIR Resources
     */
    public static MessageHeader parseFHIRMessageToMesseageHeader(String fhirResourceName, String body)
    {
        //Create Unique MesageID GUID
        UUID uuid = UUID.randomUUID();
        String uuidstr = uuid.toString();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT")); 
        String fullDate = simpleDateFormat.format(date);
        Long hour = (long)(date.getTime() % 86400000) / 3600000;

        MessageHeader mshHeader = new MessageHeader();
        if(fhirResourceName.equals("AllergyIntolerence"))
        {
            Gson gson = new Gson();
            AllergyIntolerance allergy = new AllergyIntolerance();
            allergy = gson.fromJson(body, AllergyIntolerance.class);
            //String messageEvent = allergy.getText().getStatus();
            mshHeader.setIndustryStd("FHIR");
            mshHeader.setMessageType("Clinical");
            mshHeader.setMessageEvent(allergy.getResourceType());
            mshHeader.setMessageId(uuidstr);
            mshHeader.setMessageVersion("R4");
            mshHeader.setFacilityId("UNK");
            mshHeader.setSendingApp(("UNDF"));
            mshHeader.setMessageDate(fullDate);
            mshHeader.setMessageHour(hour.toString());
            mshHeader.setMessageTime(fullDate.split("T")[1]);

        }

        if(fhirResourceName.equals("Encounter"))
        {
            Gson gson = new Gson();
            Encounter encounter = new Encounter();
            encounter = gson.fromJson(body, Encounter.class);
            //String messageEvent = allergy.getText().getStatus();
            mshHeader.setIndustryStd("FHIR");
            mshHeader.setMessageType("Clinical");
            mshHeader.setMessageEvent(encounter.getResourceType());
            mshHeader.setMessageId(uuidstr);
            mshHeader.setMessageVersion("R4");
            mshHeader.setFacilityId(encounter.getLocation().toString());
            mshHeader.setMessageDate(encounter.getStatusData());
            //mshHeader.setMessageHour(allergy.getRecordedDate().substring(11, 13));
            //mshHeader.setMessageTime(allergy.getRecordedDate().substring(11, 19));

        }

        if(fhirResourceName.equals("Patient"))
        {
            Gson gson = new Gson();
            Patient patient = new Patient();
            patient = gson.fromJson(body, Patient.class);
            //String messageEvent = allergy.getText().getStatus();
            mshHeader.setIndustryStd("FHIR");
            mshHeader.setMessageType("Clinical");
            mshHeader.setMessageEvent(patient.getResourceType());
            mshHeader.setMessageId(uuidstr);
            mshHeader.setMessageVersion("R4");
            //mshHeader.setFacilityId(patient.getLocation().toString());
            //mshHeader.setMessageDate(patient.getStatusData());
            //mshHeader.setMessageHour(allergy.getRecordedDate().substring(11, 13));
            //mshHeader.setMessageTime(allergy.getRecordedDate().substring(11, 19));

        }
        return mshHeader;
    }


    }
