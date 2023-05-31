package io.connectedhealth.idaas.hcdataobjects.edi5010.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IRA {
private String IRA_01_InvestorReportingActionCode;
private String IRA_02_DateTimePeriodFormatQualifier;
private String IRA_03_DateTimePeriod;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

