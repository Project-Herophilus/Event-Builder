package io.connectedhealth.idaas.hcdataobjects.common;

public class Discriminator {

    public String type;
    public String path;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
