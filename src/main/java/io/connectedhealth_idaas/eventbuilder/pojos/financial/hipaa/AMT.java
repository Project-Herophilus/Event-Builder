package io.connectedhealth_idaas.eventbuilder.pojos.financial.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AMT {
private String AMT_01_AmountQualifierCode;
private String AMT_02_MonetaryAmount;
private String AMT_03_CreditDebitFlagCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

