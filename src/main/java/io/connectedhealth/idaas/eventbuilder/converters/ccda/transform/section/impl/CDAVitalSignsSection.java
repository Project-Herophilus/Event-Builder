package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.impl;

import org.hl7.fhir.r4.model.Observation;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.ICDASection;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;

public class CDAVitalSignsSection implements ICDASection {
	private VitalSignsSection section;

	@SuppressWarnings("unused")
	private CDAVitalSignsSection() {
	};

	public CDAVitalSignsSection(VitalSignsSection section) {
		this.section = section;
	}

	@Override
	public SectionResultSingular<Observation> transform(IBundleInfo bundleInfo) {
		return CDASectionCommon.transformVitalSignsOrganizerList(section.getVitalSignsOrganizers(), bundleInfo);
	}
}
