package io.connectedhealth_idaas.eventbuilder.datastructures;

import io.connectedhealth_idaas.eventbuilder.dataobjects.general.*;
import io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common.Location;
import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.MessageHeader;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CustomerExperienceData {

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

    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    public void setMessageHeader(MessageHeader messageHeader) {
        this.messageHeader = messageHeader;
    }

    public PatientIdentifiers getPatientIdentifiers() {
        return patientIdentifiers;
    }

    public void setPatientIdentifiers(PatientIdentifiers patientIdentifiers) {
        this.patientIdentifiers = patientIdentifiers;
    }

    public PatientVisit getPatientVisit() {
        return patientVisit;
    }

    public void setPatientVisit(PatientVisit patientVisit) {
        this.patientVisit = patientVisit;
    }

    public PharmacyTreatmentOrder getPharmacyTreatmentOrder() {
        return pharmacyTreatmentOrder;
    }

    public void setPharmacyTreatmentOrder(PharmacyTreatmentOrder pharmacyTreatmentOrder) {
        this.pharmacyTreatmentOrder = pharmacyTreatmentOrder;
    }

    public io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common.Location getLocation() {
        return Location;
    }

    public void setLocation(io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common.Location location) {
        Location = location;
    }

    public OrderControl getOrderControl() {
        return orderControl;
    }

    public void setOrderControl(OrderControl orderControl) {
        this.orderControl = orderControl;
    }

    public Observation getObservation() {
        return observation;
    }

    public void setObservation(Observation observation) {
        this.observation = observation;
    }

    public ObservationRequest getObservationRequest() {
        return observationRequest;
    }

    public void setObservationRequest(ObservationRequest observationRequest) {
        this.observationRequest = observationRequest;
    }

    public Allergies getAllergies() {
        return allergies;
    }

    public void setAllergies(Allergies allergies) {
        this.allergies = allergies;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public AppointmentInformation getAppointmentInformation() {
        return appointmentInformation;
    }

    public void setAppointmentInformation(AppointmentInformation appointmentInformation) {
        this.appointmentInformation = appointmentInformation;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
