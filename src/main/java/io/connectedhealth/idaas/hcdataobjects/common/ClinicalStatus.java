package io.connectedhealth.idaas.hcdataobjects.common;

import java.util.List;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ClinicalStatus {

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
