package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.impl;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.ICDASection;
import org.hl7.fhir.r4.model.Encounter;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;

public class CDAEncountersSection implements ICDASection {
	private EncountersSection section;

	@SuppressWarnings("unused")
	private CDAEncountersSection() {
	};

	public CDAEncountersSection(EncountersSection section) {
		this.section = section;
	}

	@Override
	public SectionResultSingular<Encounter> transform(IBundleInfo bundleInfo) {
		return CDASectionCommon.transformEncounterActivitiesList(section.getEncounterActivitiess(), bundleInfo);
	}
}
