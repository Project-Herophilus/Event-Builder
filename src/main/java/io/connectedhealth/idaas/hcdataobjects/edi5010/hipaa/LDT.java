package io.connectedhealth.idaas.hcdataobjects.edi5010.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LDT {
private String LDT_01_LeadTimeCode;
private String LDT_02_Quantity;
private String LDT_03_UnitofTimePeriodorInterval;
private String LDT_04_Date;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

