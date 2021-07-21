package io.connectedhealth_idaas.eventbuilder.pojos.general;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PharmacyTreatmentComponent {

	private String pharmacyComponentType;
	private String manufactirerName;
	private String manufactirerID;
	private String lotID;
	private String dosageType;
	private String dosageAmount;

	public String getPharmacyComponentType() {
		return pharmacyComponentType;
	}

	public void setPharmacyComponentType(String pharmacyComponentType) {
		this.pharmacyComponentType = pharmacyComponentType;
	}

	public String getManufactirerName() {
		return manufactirerName;
	}

	public void setManufactirerName(String manufactirerName) {
		this.manufactirerName = manufactirerName;
	}

	public String getManufactirerID() {
		return manufactirerID;
	}

	public void setManufactirerID(String manufactirerID) {
		this.manufactirerID = manufactirerID;
	}

	public String getLotID() {
		return lotID;
	}

	public void setLotID(String lotID) {
		this.lotID = lotID;
	}

	public String getDosageType() {
		return dosageType;
	}

	public void setDosageType(String dosageType) {
		this.dosageType = dosageType;
	}

	public String getDosageAmount() {
		return dosageAmount;
	}

	public void setDosageAmount(String dosageAmount) {
		this.dosageAmount = dosageAmount;
	}

	//toString
public String toString() 
{
	return ReflectionToStringBuilder.toString(this);
}

}
