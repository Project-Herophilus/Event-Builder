package io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Note {
    public String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
