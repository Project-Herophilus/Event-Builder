package io.connectedhealth.idaas.hcdataobjects.edi5010.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BDD {
private String BDD_01_InvoiceNumber;
private String BDD_02_StandardCarrierAlphaCode;
private String BDD_03_ShipmentIdentificationNumber;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

