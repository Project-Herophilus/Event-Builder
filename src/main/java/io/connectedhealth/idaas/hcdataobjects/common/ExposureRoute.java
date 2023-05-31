package io.connectedhealth.idaas.hcdataobjects.common;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class ExposureRoute {

    public List<Coding> coding;

    public List<Coding> getCoding() {
        return coding;
    }

    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
