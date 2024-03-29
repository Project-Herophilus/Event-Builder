package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.impl;

import org.hl7.fhir.r4.model.Device;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Practitioner;
import org.hl7.fhir.r4.model.PractitionerRole;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.IEntityInfo;

public class EntityInfo implements IEntityInfo {
	private Practitioner practitioner;
	private PractitionerRole role;
	private Organization organization;

	private boolean orgIsNew = false;
	private Device device;

	public void setPractitioner(Practitioner practitioner) {
		this.practitioner = practitioner;
	}

	public void setPractitionerRole(PractitionerRole practitionerRole) {
		this.role = practitionerRole;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	@Override
	public Practitioner getPractitioner() {
		return practitioner;
	}

	@Override
	public PractitionerRole getPractitionerRole() {
		return role;
	}

	@Override
	public Organization getOrganization() {
		return organization;
	}

	@Override
	public boolean isOrgNew() {
		return orgIsNew;
	}

	@Override
	public void setOrgIsNew(boolean orgIsNew) {
		this.orgIsNew = orgIsNew;
	}

	@Override
	public Device getDevice() {
		return device;
	}
}
