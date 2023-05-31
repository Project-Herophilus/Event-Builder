package io.connectedhealth.idaas.hcdataobjects.common;

public class Entry {

    public String fullUrl;
    public Resource resource;

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
