package io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common;

import java.util.List;

public class BirthDate {
    public List<Extension> extension;

    public List<Extension> getExtension() {
        return extension;
    }

    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }
}
