package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.AllergyIntoleranceResource;

import java.util.List;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.AllergyIntolerance.*;

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
