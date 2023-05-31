package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.impl;

import org.hl7.fhir.r4.model.DiagnosticReport;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.IResourceTransformer;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.IEntryResult;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.ICDASection;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.impl.LocalBundleInfo;

public class CDAResultsSection implements ICDASection {
	private ResultsSection section;

	@SuppressWarnings("unused")
	private CDAResultsSection() {
	};

	public CDAResultsSection(ResultsSection section) {
		this.section = section;
	}

	@Override
	public SectionResultSingular<DiagnosticReport> transform(IBundleInfo bundleInfo) {
		IResourceTransformer rt = bundleInfo.getResourceTransformer();
		SectionResultSingular<DiagnosticReport> result = SectionResultSingular.getInstance(DiagnosticReport.class);
		LocalBundleInfo localBundleInfo = new LocalBundleInfo(bundleInfo);
		for (ResultOrganizer org : section.getResultOrganizers()) {
			IEntryResult er = rt.tResultOrganizer2DiagnosticReport(org, localBundleInfo);
			result.updateFrom(er);
			localBundleInfo.updateFrom(er);
		}
		return result;
	}
}
