package io.connectedhealth_idaas.eventbuilder.pojos.general;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Telecomm {

    private String useValue;
    private String displayValue;

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

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
