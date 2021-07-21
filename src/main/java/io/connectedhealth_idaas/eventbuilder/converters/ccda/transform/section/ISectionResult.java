package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section;

import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Resource;

import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.IResult;

public interface ISectionResult extends IResult {
	Bundle getBundle();

	List<? extends Resource> getSectionResources();

	boolean hasResourceMaps();
}
