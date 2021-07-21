package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.entry;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.instance.model.api.IBaseResource;

import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.IResult;

public interface IEntryResult extends IResult {
	Bundle getBundle();

	Bundle getFullBundle();

	void copyTo(Bundle bundle);

	boolean hasResult();

	IBaseResource findResourceResult(Class<? extends Resource> clazz);

}
