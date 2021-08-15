package io.connectedhealth_idaas.eventbuilder.builders.fhir.r4;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import org.hl7.fhir.r4.model.*;

public class AdverseEvent {

    /*
     *  Create Adverse Event Resource Only
     */
    public static org.hl7.fhir.r4.model.AdverseEvent createAdverseEventResource
    (io.connectedhealth_idaas.eventbuilder.datastructures.PersonData patientData)
    {
        // Create an allergy intollerance resource
        org.hl7.fhir.r4.model.AdverseEvent adverseEvent = new org.hl7.fhir.r4.model.AdverseEvent();

        return adverseEvent;
    }
}
