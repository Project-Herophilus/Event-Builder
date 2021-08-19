package io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.resources;

import io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common.*;

import java.util.Date;
import java.util.List;

public class Patient {
    public String resourceType;
    public String id;
    public Meta meta;
    public String type;
    public List<Entry> entry;
    public Text text;
    public List<Identifier> identifier;
    public boolean active;
    public List<Name> name;
    public String gender;
    public String birthDate;
    public Date deceasedDateTime;
    public MaritalStatus maritalStatus;
    public List<GeneralPractitioner> generalPractitioner;
    public ManagingOrganization managingOrganization;
    public List<Telecom> telecom;
    public boolean deceasedBoolean;
    public List<Address> address;
    public boolean multipleBirthBoolean;
    public List<Contact> contact;
    public List<Communication> communication;
    public List<Photo> photo;

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Entry> getEntry() {
        return entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public List<Identifier> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Name> getName() {
        return name;
    }

    public void setName(List<Name> name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDeceasedDateTime() {
        return deceasedDateTime;
    }

    public void setDeceasedDateTime(Date deceasedDateTime) {
        this.deceasedDateTime = deceasedDateTime;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public List<GeneralPractitioner> getGeneralPractitioner() {
        return generalPractitioner;
    }

    public void setGeneralPractitioner(List<GeneralPractitioner> generalPractitioner) {
        this.generalPractitioner = generalPractitioner;
    }

    public ManagingOrganization getManagingOrganization() {
        return managingOrganization;
    }

    public void setManagingOrganization(ManagingOrganization managingOrganization) {
        this.managingOrganization = managingOrganization;
    }

    public List<Telecom> getTelecom() {
        return telecom;
    }

    public void setTelecom(List<Telecom> telecom) {
        this.telecom = telecom;
    }

    public boolean isDeceasedBoolean() {
        return deceasedBoolean;
    }

    public void setDeceasedBoolean(boolean deceasedBoolean) {
        this.deceasedBoolean = deceasedBoolean;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public boolean isMultipleBirthBoolean() {
        return multipleBirthBoolean;
    }

    public void setMultipleBirthBoolean(boolean multipleBirthBoolean) {
        this.multipleBirthBoolean = multipleBirthBoolean;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public List<Communication> getCommunication() {
        return communication;
    }

    public void setCommunication(List<Communication> communication) {
        this.communication = communication;
    }

    public List<Photo> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }
}
