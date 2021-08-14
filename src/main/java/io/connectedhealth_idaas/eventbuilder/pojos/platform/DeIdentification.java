package io.connectedhealth_idaas.eventbuilder.pojos.platform;


import io.connectedhealth_idaas.eventbuilder.pojos.general.*;
import io.connectedhealth_idaas.eventbuilder.pojos.platform.MessageHeader;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DeIdentification {

    private MessageHeader msgHeader;
    private Person personData;
    private PatientVisit ptVisitData;
    private PatientIdentifiers ptIdentifiers;
    private Codeset[] codesetData;
    private Insurance insuranceData;
    private Guarantor guarantorData;

    public MessageHeader getMsgHeader() {
        return msgHeader;
    }

    public void setMsgHeader(MessageHeader msgHeader) {
        this.msgHeader = msgHeader;
    }

    public Person getPersonData() {
        return personData;
    }

    public void setPersonData(Person personData) {
        this.personData = personData;
    }

    public PatientVisit getPtVisitData() {
        return ptVisitData;
    }

    public void setPtVisitData(PatientVisit ptVisitData) {
        this.ptVisitData = ptVisitData;
    }

    public PatientIdentifiers getPtIdentifiers() {
        return ptIdentifiers;
    }

    public void setPtIdentifiers(PatientIdentifiers ptIdentifiers) {
        this.ptIdentifiers = ptIdentifiers;
    }

    public Codeset[] getCodesetData() {
        return codesetData;
    }

    public void setCodesetData(Codeset[] codesetData) {
        this.codesetData = codesetData;
    }

    public Insurance getInsuranceData() {
        return insuranceData;
    }

    public void setInsuranceData(Insurance insuranceData) {
        this.insuranceData = insuranceData;
    }

    public Guarantor getGuarantorData() {
        return guarantorData;
    }

    public void setGuarantorData(Guarantor guarantorData) {
        this.guarantorData = guarantorData;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
