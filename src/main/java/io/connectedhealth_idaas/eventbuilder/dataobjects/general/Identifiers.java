package io.connectedhealth_idaas.eventbuilder.dataobjects.general;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Identifiers {

    private String usage;
    private String identifertype;
    private String systemName;
    private String systemValue;
    private String period;
    private String assigner;

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getIdentifertype() {
        return identifertype;
    }

    public void setIdentifertype(String identifertype) {
        this.identifertype = identifertype;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemValue() {
        return systemValue;
    }

    public void setSystemValue(String systemValue) {
        this.systemValue = systemValue;
    }

    public String getPeriod() { return period;}

    public void setPeriod(String period) { this.period = period; }

    public String getAssigner() { return assigner;}

    public void setAssigner(String assigner) { this.assigner = assigner; }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
