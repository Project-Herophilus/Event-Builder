package io.connectedhealth.idaas.eventbuilder.builders.fhir.r4;

import io.connectedhealth.idaas.eventbuilder.datastructures.PersonData;

public class AdverseEvent {

    /*
     *  Create Adverse Event Resource Only
     */
    public static org.hl7.fhir.r4.model.AdverseEvent createAdverseEventResource
    (PersonData patientData)
    {
        // Create an allergy intollerance resource
        org.hl7.fhir.r4.model.AdverseEvent adverseEvent = new org.hl7.fhir.r4.model.AdverseEvent();

        return adverseEvent;
    }
}
