package io.connectedhealth_idaas.eventbuilder.pojos.general;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Identifiers {

    private String systemName;
    private String systemValue;

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemValue() {
        return systemValue;
    }

    public void setSystemValue(String systemValue) {
        this.systemValue = systemValue;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
