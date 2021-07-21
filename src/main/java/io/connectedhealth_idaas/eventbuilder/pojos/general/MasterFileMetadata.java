/**
 * 
 */
package io.connectedhealth_idaas.eventbuilder.pojos.general;

import io.connectedhealth_idaas.eventbuilder.pojos.platform.MessageHeader;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represent Master File Detailed Information
 *
 */
public class MasterFileMetadata {

	MessageHeader msgHeader;
	private String seqTestObservationMasterFile;
	private String observationId;
	private String permittedDataTypes;
	private String specimenRod;
	private String providerId;
	private String observationDesc;
	private String otherServiceDescId;
	private String otherNames;
	private String preferredReportName;
	private String preferredShortNameMnemonic;
	private String preferredLongNameMnemonic;
	private String orderability;
	private String coderepMethod;
	private String portDeviceInd;
	private String observationProdDept;
	public String getSeqTestObservationMasterFile() {
		return seqTestObservationMasterFile;
	}
	public void setSeqTestObservationMasterFile(String seqTestObservationMasterFile) {
		this.seqTestObservationMasterFile = seqTestObservationMasterFile;
	}
	public String getObservationId() {
		return observationId;
	}
	public void setObservationId(String observationId) {
		this.observationId = observationId;
	}
	public String getPermittedDataTypes() {
		return permittedDataTypes;
	}
	public void setPermittedDataTypes(String permittedDataTypes) {
		this.permittedDataTypes = permittedDataTypes;
	}
	public String getSpecimenRod() {
		return specimenRod;
	}
	public void setSpecimenRod(String specimenRod) {
		this.specimenRod = specimenRod;
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getObservationDesc() {
		return observationDesc;
	}
	public void setObservationDesc(String observationDesc) {
		this.observationDesc = observationDesc;
	}
	public String getOtherServiceDescId() {
		return otherServiceDescId;
	}
	public void setOtherServiceDescId(String otherServiceDescId) {
		this.otherServiceDescId = otherServiceDescId;
	}
	public String getOtherNames() {
		return otherNames;
	}
	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	public String getPreferredReportName() {
		return preferredReportName;
	}
	public void setPreferredReportName(String preferredReportName) {
		this.preferredReportName = preferredReportName;
	}
	public String getPreferredShortNameMnemonic() {
		return preferredShortNameMnemonic;
	}
	public void setPreferredShortNameMnemonic(String preferredShortNameMnemonic) {
		this.preferredShortNameMnemonic = preferredShortNameMnemonic;
	}
	public String getPreferredLongNameMnemonic() {
		return preferredLongNameMnemonic;
	}
	public void setPreferredLongNameMnemonic(String preferredLongNameMnemonic) {
		this.preferredLongNameMnemonic = preferredLongNameMnemonic;
	}
	public String getOrderability() {
		return orderability;
	}
	public void setOrderability(String orderability) {
		this.orderability = orderability;
	}
	public String getCoderepMethod() {
		return coderepMethod;
	}
	public void setCoderepMethod(String coderepMethod) {
		this.coderepMethod = coderepMethod;
	}
	public String getPortDeviceInd() {
		return portDeviceInd;
	}
	public void setPortDeviceInd(String portDeviceInd) {
		this.portDeviceInd = portDeviceInd;
	}
	public String getObservationProdDept() {
		return observationProdDept;
	}
	public void setObservationProdDept(String observationProdDept) {
		this.observationProdDept = observationProdDept;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
