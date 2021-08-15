package io.connectedhealth_idaas.eventbuilder.dataobjects.financial.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BW {
private String BW_01_OriginEDICarrierCode;
private String BW_02_ShipmentIdentificationNumber;
private String BW_03_WeightUnitCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

