package io.connectedhealth_idaas.eventbuilder.parsers.fhir;

//Common Imports
import io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.resources.Encounter;
import io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.resources.Patient;
import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.MessageHeader;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;
// ConnectedHealth Imports
import io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.resources.AllergyIntolerance;

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
            mshHeader.setFacilityId(allergy.getId());
            mshHeader.setMessageDate(allergy.getRecordedDate());
            mshHeader.setMessageHour(allergy.getRecordedDate().substring(11, 13));
            mshHeader.setMessageTime(allergy.getRecordedDate().substring(11, 19));

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
