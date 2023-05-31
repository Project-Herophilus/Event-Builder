package io.connectedhealth.idaas.eventbuilder.parsers.fhir;

import com.google.gson.Gson;
import io.connectedhealth.idaas.hcdataobjects.common.AllergyIntolerance;
import io.connectedhealth.idaas.hcdataobjects.common.Note;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.UUID;

public class FHIRGenericParsing {

    private static final Logger LOG = LoggerFactory.getLogger(FHIRGenericParsing.class);

    /*
     * Generic Parsing for Allergy Intollerance
     */
    public static void parseFHIRMessage(String fhirResourceName, String body)
    {
        // Generic Parsing for FHIR resources
        if(fhirResourceName.equals("AllergyIntolerence"))
        {
            Gson gson = new Gson();
            // Additional Parsing
            AllergyIntolerance allergy = new AllergyIntolerance();
            UUID uuid = UUID.randomUUID();
            String uuidstr = uuid.toString();
            allergy = gson.fromJson(body, AllergyIntolerance.class);
            List<Note> obj = allergy.getNote();
            String noteVal = obj.get(0).getText();

        }
    }
}
