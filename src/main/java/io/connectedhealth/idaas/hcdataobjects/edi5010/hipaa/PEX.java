package io.connectedhealth.idaas.hcdataobjects.edi5010.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PEX {
private String PEX_01_GeneralExpenseQualifier;
private String PEX_02_RateValueQualifier;
private String PEX_03_MonetaryAmount;
private String PEX_04_TaxTypeCode;
private String PEX_05_YesNoConditionorResponseCode;
private String PEX_06_EntityIdentifierCode;
private String PEX_07_TaxExemptCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

