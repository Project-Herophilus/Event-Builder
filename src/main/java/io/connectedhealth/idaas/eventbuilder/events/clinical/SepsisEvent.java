package io.connectedhealth.idaas.eventbuilder.events.clinical;


import io.connectedhealth.idaas.hcdataobjects.common.Location;
import io.connectedhealth.idaas.hcdataobjects.general.*;
import io.connectedhealth.idaas.hcdataobjects.platform.MessageHeader;

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
