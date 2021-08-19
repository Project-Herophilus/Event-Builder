package io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class Meta {
    public List<Tag> tag;
    public Date lastUpdated;

    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
