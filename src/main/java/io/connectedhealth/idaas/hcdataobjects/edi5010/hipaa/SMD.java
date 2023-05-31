package io.connectedhealth.idaas.hcdataobjects.edi5010.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SMD {
private String SMD_01_ServiceLevelCode;
private String SMD_02_ShipmentMethodofPayment;
private String SMD_03_PickuporDeliveryCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

