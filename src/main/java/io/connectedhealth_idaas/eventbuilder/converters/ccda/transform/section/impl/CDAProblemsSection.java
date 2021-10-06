package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl;

import org.hl7.fhir.r4.model.Condition;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;

import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.IResourceTransformer;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.entry.IEntryResult;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.ICDASection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.impl.LocalBundleInfo;

public class CDAProblemsSection implements ICDASection {
	private ProblemSection section;

	@SuppressWarnings("unused")
	private CDAProblemsSection() {
	};

	public CDAProblemsSection(ProblemSection section) {
		this.section = section;
	}

	@Override
	public SectionResultSingular<Condition> transform(IBundleInfo bundleInfo) {
		IResourceTransformer rt = bundleInfo.getResourceTransformer();
		SectionResultSingular<Condition> result = SectionResultSingular.getInstance(Condition.class);
		LocalBundleInfo localBundleInfo = new LocalBundleInfo(bundleInfo);
		for (ProblemConcernAct act : section.getConsolProblemConcerns()) {
			IEntryResult er = rt.tProblemConcernAct2Condition(act, localBundleInfo);
			result.updateFrom(er);
			localBundleInfo.updateFrom(er);
		}
		return result;
	}
}
