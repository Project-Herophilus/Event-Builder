package io.connectedhealth.idaas.hcdataobjects.common;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Identifier {
    public String use;
    public Type type;
    public String system;
    public String value;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
