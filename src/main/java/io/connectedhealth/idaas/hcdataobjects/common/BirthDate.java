package io.connectedhealth.idaas.hcdataobjects.common;

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
