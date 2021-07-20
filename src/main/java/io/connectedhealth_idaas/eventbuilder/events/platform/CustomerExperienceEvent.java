package io.connectedhealth_idaas.eventbuilder.events.platform;

import io.connectedhealth_idaas.eventbuilder.pojos.platform.*;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.Location;

public class CustomerExperienceEvent {

    public MessageHeader messageHeader;
    public PatientIdentifiers patientIdentifiers;
    public PatientVisit patientVisit;
    public PharmacyTreatmentOrder pharmacyTreatmentOrder;
    public Location Location;
    public OrderControl orderControl;
    public Observation observation;
    public ObservationRequest observationRequest;
    public Allergies allergies;
    public Diagnosis diagnosis;
    public AppointmentInformation appointmentInformation;
    public Insurance insurance;

}
