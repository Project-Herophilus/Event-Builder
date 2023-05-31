package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util;

import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Resource;

public interface IDeferredReference {
	public String getFhirType();

	public Identifier getIdentifier();

	public Resource getResource();

	public void resolve(Reference reference);
}
