package io.connectedhealth_idaas.eventbuilder.dataobjects.general;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Address {

    private String Address1;
    private String Address2;
    private String City;
    private String StateCode;
    private String PostalCode;
    private String Country;
    private String AddressType;

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String address1) {
        Address1 = address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String address2) {
        Address2 = address2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStateCode() {
        return StateCode;
    }

    public void setStateCode(String stateCode) {
        StateCode = stateCode;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getAddressType() {
        return AddressType;
    }

    public void setAddressType(String addressType) {
        AddressType = addressType;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }


}
