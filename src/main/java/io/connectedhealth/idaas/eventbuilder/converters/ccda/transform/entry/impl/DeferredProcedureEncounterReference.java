package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.impl;

import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Procedure;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Resource;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.IDeferredReference;

public class DeferredProcedureEncounterReference implements IDeferredReference {
	private Procedure procedure;
	private Identifier identifier;

	public DeferredProcedureEncounterReference(Procedure procedure, Identifier identifier) {
		this.procedure = procedure;
		this.identifier = identifier;
	}

	@Override
	public String getFhirType() {
		return "Encounter";
	}

	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	@Override
	public Resource getResource() {
		return procedure;
	}

	@Override
	public void resolve(Reference reference) {
		procedure.setEncounter(reference);
	}
}
