package io.connectedhealth.idaas.hcdataobjects.general;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Telecomm {

    private String useValue;
    private String displayValue;
    private String telecommType;

    public String getUseValue() {
        return useValue;
    }

    public void setUseValue(String useValue) {
        this.useValue = useValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getTelecommType() {
        return telecommType;
    }

    public void setTelecommType(String telecommType) {
        this.telecommType = telecommType;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
