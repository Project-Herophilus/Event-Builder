package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section.impl;

import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Resource;

import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.entry.IEntryResult;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.util.FHIRUtil;

public class SectionResultDynamic extends SectionResult {
	private List<Resource> resources = new ArrayList<Resource>();

	public void add(Resource resource) {
		getBundle().addEntry().setResource(resource);
		resources.add(resource);
	}

	public <T extends Resource> void updateFrom(IEntryResult entryResult, Class<T> clazz) {
		updateFrom(entryResult);
		Bundle bundle = entryResult.getBundle();
		if (bundle != null) {
			List<? extends Resource> sectionResources = FHIRUtil.findResources(bundle, clazz);
			resources.addAll(sectionResources);
		}
	}

	@Override
	public List<Resource> getSectionResources() {
		return resources;
	}

}
