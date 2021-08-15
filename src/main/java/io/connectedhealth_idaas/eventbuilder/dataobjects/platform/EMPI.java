package io.connectedhealth_idaas.eventbuilder.dataobjects.platform;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EMPI {
    MessageHeader msgHeader;
    private String lastName;
    private String firstName;
    private String address;
    private String SSN;
    private String DLN;
    private String accountNumber;
    private String incidentofcareID;
    private String[] PhoneNumber;
    private String platformModule;
    private String processingComponent;
    private String[] empiNumnber;

    public MessageHeader getMsgHeader() {
        return msgHeader;
    }

    public void setMsgHeader(MessageHeader msgHeader) {
        this.msgHeader = msgHeader;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getDLN() {
        return DLN;
    }

    public void setDLN(String DLN) {
        this.DLN = DLN;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIncidentofcareID() {
        return incidentofcareID;
    }

    public void setIncidentofcareID(String incidentofcareID) {
        this.incidentofcareID = incidentofcareID;
    }

    public String[] getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String[] phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPlatformModule() {
        return platformModule;
    }

    public void setPlatformModule(String platformModule) {
        this.platformModule = platformModule;
    }

    public String getProcessingComponent() {
        return processingComponent;
    }

    public void setProcessingComponent(String processingComponent) {
        this.processingComponent = processingComponent;
    }

    public String[] getEmpiNumnber() {
        return empiNumnber;
    }

    public void setEmpiNumnber(String[] empiNumnber) {
        this.empiNumnber = empiNumnber;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }


}
