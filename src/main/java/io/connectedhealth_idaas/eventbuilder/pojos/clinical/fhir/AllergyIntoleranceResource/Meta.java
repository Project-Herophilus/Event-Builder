package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.AllergyIntoleranceResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Meta {
    public List<Tag> tag;

    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
