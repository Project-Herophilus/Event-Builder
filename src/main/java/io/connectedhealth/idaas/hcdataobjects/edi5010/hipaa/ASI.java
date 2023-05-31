package io.connectedhealth.idaas.hcdataobjects.edi5010.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ASI {
private String ASI_01_ActionCode;
private String ASI_02_MaintenanceTypeCode;
private String ASI_03_StatusReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

