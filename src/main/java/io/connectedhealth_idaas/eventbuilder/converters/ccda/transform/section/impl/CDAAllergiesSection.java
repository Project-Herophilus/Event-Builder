package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl;

import org.hl7.fhir.dstu3.model.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;

import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.IResourceTransformer;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.entry.IEntryResult;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.ICDASection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.impl.LocalBundleInfo;

public class CDAAllergiesSection implements ICDASection {
	private AllergiesSection section;

	@SuppressWarnings("unused")
	private CDAAllergiesSection() {
	};

	public CDAAllergiesSection(AllergiesSection section) {
		this.section = section;
	}

	@Override
	public SectionResultSingular<AllergyIntolerance> transform(IBundleInfo bundleInfo) {
		IResourceTransformer rt = bundleInfo.getResourceTransformer();
		SectionResultSingular<AllergyIntolerance> result = SectionResultSingular.getInstance(AllergyIntolerance.class);
		LocalBundleInfo localBundleInfo = new LocalBundleInfo(bundleInfo);
		for (AllergyProblemAct act : section.getAllergyProblemActs()) {
			IEntryResult er = rt.tAllergyProblemAct2AllergyIntolerance(act, localBundleInfo);
			result.updateFrom(er);
			localBundleInfo.updateFrom(er);
		}
		return result;
	}
}
