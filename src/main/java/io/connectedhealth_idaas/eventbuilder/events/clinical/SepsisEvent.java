package io.connectedhealth_idaas.eventbuilder.events.clinical;


import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.Location;
import io.connectedhealth_idaas.eventbuilder.pojos.general.*;
import io.connectedhealth_idaas.eventbuilder.pojos.platform.MessageHeader;

public class SepsisEvent {

    private MessageHeader messageHeader;
    private PatientIdentifiers patientIdentifiers;
    private PatientVisit patientVisit;
    private PharmacyTreatmentOrder pharmacyTreatmentOrder;
    private Location Location;
    private OrderControl orderControl;
    private Observation observation;
    private ObservationRequest observationRequest;
    private MedicalNotes medicalNotes;
}
