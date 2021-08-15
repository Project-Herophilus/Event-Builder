package io.connectedhealth_idaas.eventbuilder.dataobjects.general;

import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.MessageHeader;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents the Master File data
 *
 */
public class MasterFileEntry {

	MessageHeader msgHeader;
	private String recordLevelEventCode;
	private String mfnControlId;
	private String effectiveDateTime;
	private String primaryKeyValue;
	public String getRecordLevelEventCode() {
		return recordLevelEventCode;
	}
	public void setRecordLevelEventCode(String recordLevelEventCode) {
		this.recordLevelEventCode = recordLevelEventCode;
	}
	public String getMfnControlId() {
		return mfnControlId;
	}
	public void setMfnControlId(String mfnControlId) {
		this.mfnControlId = mfnControlId;
	}
	public String getEffectiveDateTime() {
		return effectiveDateTime;
	}
	public void setEffectiveDateTime(String effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}
	public String getPrimaryKeyValue() {
		return primaryKeyValue;
	}
	public void setPrimaryKeyValue(String primaryKeyValue) {
		this.primaryKeyValue = primaryKeyValue;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
	
}
