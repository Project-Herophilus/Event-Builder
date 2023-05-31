package io.connectedhealth.idaas.hcdataobjects.common;

import java.util.Date;
import java.util.List;

public class Expansion {

    public String identifier;
    public Date timestamp;
    public List<Contain> contains;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<Contain> getContains() {
        return contains;
    }

    public void setContains(List<Contain> contains) {
        this.contains = contains;
    }
}
