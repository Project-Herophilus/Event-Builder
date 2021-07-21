package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.entry;

import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.PractitionerRole;

public interface IEntityInfo {
	Practitioner getPractitioner();

	PractitionerRole getPractitionerRole();

	Organization getOrganization();

	boolean isOrgNew();

	void setOrgIsNew(boolean orgIsNew);

	Device getDevice();
}
