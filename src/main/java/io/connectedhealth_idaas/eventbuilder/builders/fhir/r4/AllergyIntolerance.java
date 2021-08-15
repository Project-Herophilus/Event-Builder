package io.connectedhealth_idaas.eventbuilder.builders.fhir.r4;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import org.hl7.fhir.r4.model.*;

public class AllergyIntolerance {

    /*
     *  Create Allergy Intollerance Resource Only
     */
    public static org.hl7.fhir.r4.model.AllergyIntolerance createAllergyIntolleranceResource
    (io.connectedhealth_idaas.eventbuilder.datastructures.PersonData patientData)
    {
        // Create an allergy intollerance resource
        org.hl7.fhir.r4.model.AllergyIntolerance allergyIntolerance = new org.hl7.fhir.r4.model.AllergyIntolerance();

        return allergyIntolerance;
    }

    // Have no idea -  old sample code
    public static void createAllergyIntoleranceObject()
    {
        // Create a patient object
        org.hl7.fhir.r4.model.AllergyIntolerance allergyIntolerance = new org.hl7.fhir.r4.model.AllergyIntolerance();
        allergyIntolerance.addIdentifier()
                .setSystem("http://acme.org/mrns")
                .setValue("12345");
    }

}
