package io.connectedhealth.idaas.hcdataobjects.common;

import java.util.List;

public class Relationship {
    public List<Coding> coding;

    public List<Coding> getCoding() {
        return coding;
    }

    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }
}
