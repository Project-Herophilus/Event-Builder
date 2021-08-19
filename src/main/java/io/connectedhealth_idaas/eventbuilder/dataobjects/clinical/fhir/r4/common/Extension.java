package io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common;

import java.util.Date;

public class Extension {

    public String url;
    public int valueInteger;
    public String valueCode;
    public boolean valueBoolean;
    public String valueMarkdown;
    public String valueUrl;
    public String valueCanonical;
    public String valueString;
    public Date valueDateTime;
    public int valueDecimal;
    public ValueCodeableConcept valueCodeableConcept;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getValueInteger() {
        return valueInteger;
    }

    public void setValueInteger(int valueInteger) {
        this.valueInteger = valueInteger;
    }

    public String getValueCode() {
        return valueCode;
    }

    public void setValueCode(String valueCode) {
        this.valueCode = valueCode;
    }

    public boolean isValueBoolean() {
        return valueBoolean;
    }

    public void setValueBoolean(boolean valueBoolean) {
        this.valueBoolean = valueBoolean;
    }

    public String getValueMarkdown() {
        return valueMarkdown;
    }

    public void setValueMarkdown(String valueMarkdown) {
        this.valueMarkdown = valueMarkdown;
    }

    public String getValueUrl() {
        return valueUrl;
    }

    public void setValueUrl(String valueUrl) {
        this.valueUrl = valueUrl;
    }

    public String getValueCanonical() {
        return valueCanonical;
    }

    public void setValueCanonical(String valueCanonical) {
        this.valueCanonical = valueCanonical;
    }

    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    public Date getValueDateTime() {
        return valueDateTime;
    }

    public void setValueDateTime(Date valueDateTime) {
        this.valueDateTime = valueDateTime;
    }

    public int getValueDecimal() {
        return valueDecimal;
    }

    public void setValueDecimal(int valueDecimal) {
        this.valueDecimal = valueDecimal;
    }

    public ValueCodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    public void setValueCodeableConcept(ValueCodeableConcept valueCodeableConcept) {
        this.valueCodeableConcept = valueCodeableConcept;
    }
}
