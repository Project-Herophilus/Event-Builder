package io.connectedhealth.idaas.hcdataobjects.edi5010.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BAL {
private String BAL_01_BalanceTypeCode;
private String BAL_02_AmountQualifierCode;
private String BAL_03_MonetaryAmount;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

