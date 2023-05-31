package io.connectedhealth.idaas.hcdataobjects.edi5010.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SPK {
private String SPK_01_SpecimenKitTypeCode;
private String SPK_02_TransportationMethodTypeCode;
private String SPK_03_Temperature;
private String SPK_04_IdentificationCodeQualifier;
private String SPK_05_IdentificationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

