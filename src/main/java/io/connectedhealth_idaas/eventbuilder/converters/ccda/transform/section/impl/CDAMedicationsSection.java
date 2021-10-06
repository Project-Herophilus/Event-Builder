package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl;

import org.hl7.fhir.r4.model.MedicationStatement;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;

import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.IResourceTransformer;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.entry.IEntryResult;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.ICDASection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.impl.LocalBundleInfo;

public class CDAMedicationsSection implements ICDASection {
	private MedicationsSection section;

	@SuppressWarnings("unused")
	private CDAMedicationsSection() {
	};

	public CDAMedicationsSection(MedicationsSection section) {
		this.section = section;
	}

	@Override
	public SectionResultSingular<MedicationStatement> transform(IBundleInfo bundleInfo) {
		IResourceTransformer rt = bundleInfo.getResourceTransformer();
		SectionResultSingular<MedicationStatement> result = SectionResultSingular
				.getInstance(MedicationStatement.class);
		LocalBundleInfo localBundleInfo = new LocalBundleInfo(bundleInfo);

		for (MedicationActivity act : section.getMedicationActivities()) {
			IEntryResult er = rt.tMedicationActivity2MedicationStatement(act, localBundleInfo);
			result.updateFrom(er);
			localBundleInfo.updateFrom(er);
		}
		return result;

	}

}
