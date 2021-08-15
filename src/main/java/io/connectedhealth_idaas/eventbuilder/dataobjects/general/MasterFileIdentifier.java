/**
 * 
 */
package io.connectedhealth_idaas.eventbuilder.dataobjects.general;

import io.connectedhealth_idaas.eventbuilder.dataobjects.platform.MessageHeader;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents the MFI segment in 
 * HL7 and has been augmented to support additional needed attributes. It can 
 * also be further augmented to support additional needs.
 *
 */
public class MasterFileIdentifier {

	MessageHeader msgHeader;
	private String masterFileIdentifier;
	private String masterFileAppIdentifier;
	private String fileLevelEventCode;
	private String enteredDateTime;
	private String effectiveDateTime;
	private String respLevelCode;
	public String getMasterFileIdentifier() {
		return masterFileIdentifier;
	}
	public void setMasterFileIdentifier(String masterFileIdentifier) {
		this.masterFileIdentifier = masterFileIdentifier;
	}
	public String getMasterFileAppIdentifier() {
		return masterFileAppIdentifier;
	}
	public void setMasterFileAppIdentifier(String masterFileAppIdentifier) {
		this.masterFileAppIdentifier = masterFileAppIdentifier;
	}
	public String getFileLevelEventCode() {
		return fileLevelEventCode;
	}
	public void setFileLevelEventCode(String fileLevelEventCode) {
		this.fileLevelEventCode = fileLevelEventCode;
	}
	public String getEnteredDateTime() {
		return enteredDateTime;
	}
	public void setEnteredDateTime(String enteredDateTime) {
		this.enteredDateTime = enteredDateTime;
	}
	public String getEffectiveDateTime() {
		return effectiveDateTime;
	}
	public void setEffectiveDateTime(String effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}
	public String getRespLevelCode() {
		return respLevelCode;
	}
	public void setRespLevelCode(String respLevelCode) {
		this.respLevelCode = respLevelCode;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
