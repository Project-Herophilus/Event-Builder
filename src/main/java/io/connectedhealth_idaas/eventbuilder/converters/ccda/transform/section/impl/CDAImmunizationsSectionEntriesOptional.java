package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl;

import org.hl7.fhir.r4.model.Immunization;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;

import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.ICDASection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;

public class CDAImmunizationsSectionEntriesOptional implements ICDASection {
	private ImmunizationsSectionEntriesOptional section;

	@SuppressWarnings("unused")
	private CDAImmunizationsSectionEntriesOptional() {
	};

	public CDAImmunizationsSectionEntriesOptional(ImmunizationsSectionEntriesOptional section) {
		this.section = section;
	}

	@Override
	public SectionResultSingular<Immunization> transform(IBundleInfo bundleInfo) {
		return CDASectionCommon.transformImmunizationActivityList(section.getImmunizationActivities(), bundleInfo);
	}
}
