package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl;

import org.hl7.fhir.dstu3.model.Encounter;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;

import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.ICDASection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;

public class CDAEncountersSectionEntriesOptional implements ICDASection {
	private EncountersSectionEntriesOptional section;

	@SuppressWarnings("unused")
	private CDAEncountersSectionEntriesOptional() {
	};

	public CDAEncountersSectionEntriesOptional(EncountersSectionEntriesOptional section) {
		this.section = section;
	}

	@Override
	public SectionResultSingular<Encounter> transform(IBundleInfo bundleInfo) {
		return CDASectionCommon.transformEncounterActivitiesList(section.getEncounterActivitiess(), bundleInfo);
	}
}
