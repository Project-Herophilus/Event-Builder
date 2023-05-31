package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.impl;

import org.hl7.fhir.r4.model.Observation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.IResourceTransformer;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.IEntryResult;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.ICDASection;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.impl.LocalBundleInfo;

public class CDAFunctionalStatusSection implements ICDASection {
	private FunctionalStatusSection section;

	@SuppressWarnings("unused")
	private CDAFunctionalStatusSection() {
	};

	public CDAFunctionalStatusSection(FunctionalStatusSection section) {
		this.section = section;
	}

	@Override
	public SectionResultSingular<Observation> transform(IBundleInfo bundleInfo) {
		IResourceTransformer rt = bundleInfo.getResourceTransformer();
		SectionResultSingular<Observation> result = SectionResultSingular.getInstance(Observation.class);
		LocalBundleInfo localBundleInfo = new LocalBundleInfo(bundleInfo);
		for (FunctionalStatusResultOrganizer org : section.getFunctionalStatusResultOrganizers()) {
			for (org.openhealthtools.mdht.uml.cda.Observation obs : org.getObservations()) {
				IEntryResult er = rt.tFunctionalStatus2Observation(obs, localBundleInfo);
				result.updateFrom(er);
				localBundleInfo.updateFrom(er);
			}
		}
		return result;
	}
}
