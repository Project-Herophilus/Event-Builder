package io.connectedhealth_idaas.eventbuilder.parsers.fhir;

//Common Imports
import io.connectedhealth_idaas.eventbuilder.pojos.platform.MessageHeader;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.UUID;
// ConnectedHealth Imports
import io.connectedhealth_idaas.eventbuilder.pojos.platform.RoutingEvent;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.AllergyIntoleranceResource.AllergyIntolerance;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.AllergyIntoleranceResource.Note;

/*
 * Designed to support general parsing of FHIR messages
 *
 */
public class FHIRResourceParser {

    private static final Logger LOG = LoggerFactory.getLogger(FHIRResourceParser.class);

    /*
     *   Return Generic Message Header based on FHIR Resources
     */
    public static MessageHeader parseFHIRMessage(String fhirResourceName, String body)
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

        return mshHeader;
    }


    }
