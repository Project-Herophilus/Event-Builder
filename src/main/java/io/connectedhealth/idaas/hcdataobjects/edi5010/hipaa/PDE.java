package io.connectedhealth.idaas.hcdataobjects.edi5010.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PDE {
private String PDE_01_FreeformMessageText;
private String PDE_02_DirectionIdentifierCode;
private String PDE_04_MeasurementValue;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

