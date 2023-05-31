package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.impl;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.ICDASection;
import org.hl7.fhir.r4.model.Procedure;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.IResourceTransformer;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.IEntryResult;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.impl.LocalBundleInfo;

public class CDAProceduresSection implements ICDASection {
	private ProceduresSection section;

	@SuppressWarnings("unused")
	private CDAProceduresSection() {
	};

	public CDAProceduresSection(ProceduresSection section) {
		this.section = section;
	}

	@Override
	public SectionResultSingular<Procedure> transform(IBundleInfo bundleInfo) {
		IResourceTransformer rt = bundleInfo.getResourceTransformer();
		SectionResultSingular<Procedure> result = SectionResultSingular.getInstance(Procedure.class);
		LocalBundleInfo localBundleInfo = new LocalBundleInfo(bundleInfo);
		for (ProcedureActivityProcedure act : section.getConsolProcedureActivityProcedures()) {
			IEntryResult er = rt.tProcedure2Procedure(act, localBundleInfo);
			result.updateFrom(er);
			localBundleInfo.updateFrom(er);
		}
		return result;
	}
}
