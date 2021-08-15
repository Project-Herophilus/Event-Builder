package io.connectedhealth_idaas.eventbuilder.datastructures;

import io.connectedhealth_idaas.eventbuilder.dataobjects.general.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PersonData {

    private Person personData;
    private Address addressData;
    private Telecomm telecommData;
    private Identifiers identifiersData;
    private String gender;
    private String birthDate;
    private Codeset codesetData;
    private ContactPerson contactPersonData;

    public Person getPersonData() {
        return personData;
    }

    public void setPersonData(Person personData) {
        this.personData = personData;
    }

    public Address getAddressData() {
        return addressData;
    }

    public void setAddressData(Address addressData) {
        this.addressData = addressData;
    }

    public Telecomm getTelecommData() {
        return telecommData;
    }

    public void setTelecommData(Telecomm telecommData) {
        this.telecommData = telecommData;
    }

    public Identifiers getIdentifiersData() {
        return identifiersData;
    }

    public void setIdentifiersData(Identifiers identifiersData) {
        this.identifiersData = identifiersData;
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

    public Codeset getCodesetData() {
        return codesetData;
    }

    public void setCodesetData(Codeset codesetData) {
        this.codesetData = codesetData;
    }

    public ContactPerson getContactPersonData() {
        return contactPersonData;
    }

    public void setContactPersonData(ContactPerson contactPersonData) {
        this.contactPersonData = contactPersonData;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
