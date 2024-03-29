package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.impl;

import java.util.List;

import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Resource;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.util.FHIRUtil;

public class SectionResultSingular<T extends Resource> extends SectionResult {
	private Class<T> clazz;

	public SectionResultSingular(Bundle bundle, Class<T> clazz) {
		super(bundle);
		this.clazz = clazz;
	}

	public SectionResultSingular(Class<T> clazz) {
		super();
		this.clazz = clazz;
	}

	public static <U extends Resource> SectionResultSingular<U> getInstance(Bundle bundle, Class<U> clazz) {
		return new SectionResultSingular<U>(bundle, clazz);
	}

	public static <U extends Resource> SectionResultSingular<U> getInstance(Class<U> clazz) {
		return new SectionResultSingular<U>(clazz);
	}

	@Override
	public List<T> getSectionResources() {
		Bundle bundle = getBundle();
		return FHIRUtil.findResources(bundle, clazz);
	}

}
