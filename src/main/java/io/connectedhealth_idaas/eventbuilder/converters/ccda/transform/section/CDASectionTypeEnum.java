package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section;

import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;

import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAAllergiesSection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAEncountersSection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAEncountersSectionEntriesOptional;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAFamilyHistorySection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAFunctionalStatusSection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAImmunizationsSection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAImmunizationsSectionEntriesOptional;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAMedicalEquipmentSection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAMedicationsSection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAProblemsSection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAProceduresSection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAResultsSection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDASocialHistorySection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAUnplementedSection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAVitalSignsSection;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl.CDAVitalSignsSectionEntriesOptional;

public enum CDASectionTypeEnum {
	ALLERGIES_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof AllergiesSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAAllergiesSection((AllergiesSection) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAAllergiesSection(ccd.getAllergiesSection());
		}
	},
	IMMUNIZATIONS_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof ImmunizationsSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAImmunizationsSection((ImmunizationsSection) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return null;
		}
	},
	IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL {
		@Override
		public boolean supports(Section section) {
			return section instanceof ImmunizationsSectionEntriesOptional;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAImmunizationsSectionEntriesOptional((ImmunizationsSectionEntriesOptional) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAImmunizationsSectionEntriesOptional(ccd.getImmunizationsSectionEntriesOptional());
		}
	},
	MEDICATIONS_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof MedicationsSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAMedicationsSection((MedicationsSection) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAMedicationsSection(ccd.getMedicationsSection());
		}
	},
	PROBLEM_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof ProblemSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAProblemsSection((ProblemSection) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAProblemsSection(ccd.getProblemSection());
		}
	},
	PROCEDURES_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof ProceduresSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAProceduresSection((ProceduresSection) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAProceduresSection(ccd.getProceduresSection());
		}
	},
	ENCOUNTERS_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof EncountersSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAEncountersSection((EncountersSection) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAEncountersSection(ccd.getEncountersSection());
		}
	},
	ENCOUNTERS_SECTION_ENTRIES_OPTIONAL {
		@Override
		public boolean supports(Section section) {
			return section instanceof EncountersSectionEntriesOptional;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAEncountersSectionEntriesOptional((EncountersSectionEntriesOptional) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return null;
		}
	},
	VITAL_SIGNS_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof VitalSignsSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAVitalSignsSection((VitalSignsSection) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return null;
		}
	},
	VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL {
		@Override
		public boolean supports(Section section) {
			return section instanceof VitalSignsSectionEntriesOptional;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAVitalSignsSectionEntriesOptional((VitalSignsSectionEntriesOptional) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAVitalSignsSectionEntriesOptional(ccd.getVitalSignsSectionEntriesOptional());
		}
	},
	SOCIAL_HISTORY_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof SocialHistorySection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDASocialHistorySection((SocialHistorySection) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDASocialHistorySection(ccd.getSocialHistorySection());
		}
	},
	RESULTS_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof ResultsSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAResultsSection((ResultsSection) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAResultsSection(ccd.getResultsSection());
		}
	},
	FUNCTIONAL_STATUS_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof FunctionalStatusSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAFunctionalStatusSection((FunctionalStatusSection) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAFunctionalStatusSection(ccd.getFunctionalStatusSection());
		}
	},
	FAMILY_HISTORY_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof FamilyHistorySection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAFamilyHistorySection((FamilyHistorySection) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAFamilyHistorySection(ccd.getFamilyHistorySection());
		}
	},
	MEDICAL_EQUIPMENT_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof MedicalEquipmentSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAMedicalEquipmentSection((MedicalEquipmentSection) section);
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAMedicalEquipmentSection(ccd.getMedicalEquipmentSection());
		}
	},
	ADVANCED_DIRECTIVES_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof AdvanceDirectivesSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAUnplementedSection();
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAUnplementedSection();
		}
	},
	PAYERS_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof PayersSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAUnplementedSection();
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAUnplementedSection();
		}
	},
	PLAN_OF_CARE_SECTION {
		@Override
		public boolean supports(Section section) {
			return section instanceof PlanOfCareSection;
		}

		@Override
		public ICDASection toCDASection(Section section) {
			return new CDAUnplementedSection();
		}

		@Override
		public ICDASection toCDASection(ContinuityOfCareDocument ccd) {
			return new CDAUnplementedSection();
		}
	};

	public abstract boolean supports(Section section);

	public abstract ICDASection toCDASection(Section section);

	public abstract ICDASection toCDASection(ContinuityOfCareDocument ccd);
}
