package io.connectedhealth.idaas.hcdataobjects.edi5010.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CHR {
private String CHR_01_RateSource;
private String CHR_02_BilledRatedasQualifier;
private String CHR_03_Multiplier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

