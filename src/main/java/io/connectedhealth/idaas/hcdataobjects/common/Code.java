package io.connectedhealth.idaas.hcdataobjects.common;

import java.util.List;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


public class Code {

    public List<Coding> coding;
    public String text;

    public List<Coding> getCoding() {
        return coding;
    }

    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
