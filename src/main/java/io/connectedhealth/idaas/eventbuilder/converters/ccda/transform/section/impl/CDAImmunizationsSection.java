package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.impl;

import org.hl7.fhir.r4.model.Immunization;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.ICDASection;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;

public class CDAImmunizationsSection implements ICDASection {
	private ImmunizationsSection section;

	@SuppressWarnings("unused")
	private CDAImmunizationsSection() {
	};

	public CDAImmunizationsSection(ImmunizationsSection section) {
		this.section = section;
	}

	@Override
	public SectionResultSingular<Immunization> transform(IBundleInfo bundleInfo) {
		return CDASectionCommon.transformImmunizationActivityList(section.getImmunizationActivities(), bundleInfo);
	}
}
