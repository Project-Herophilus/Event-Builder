package io.connectedhealth.idaas.eventbuilder.builders.fhir.r4;

import io.connectedhealth.idaas.eventbuilder.datastructures.PersonData;

public class AllergyIntolerance {

    /*
     *  Create Allergy Intollerance Resource Only
     */
    public static org.hl7.fhir.r4.model.AllergyIntolerance createAllergyIntolleranceResource
    (PersonData patientData)
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
