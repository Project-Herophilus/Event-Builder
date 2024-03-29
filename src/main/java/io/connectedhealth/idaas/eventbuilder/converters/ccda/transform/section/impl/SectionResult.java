package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.CDAIIResourceMaps;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.IEntityInfo;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.IEntryResult;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.IMedicationsInformation;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section.ISectionResult;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.IDeferredReference;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.impl.CDACDMap;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.impl.CDAIIMap;

public abstract class SectionResult implements ISectionResult {

	private Bundle bundle;
	private List<IDeferredReference> deferredReferences;
	private CDAIIMap<IEntityInfo> entities;
	private CDAIIResourceMaps<IBaseResource> resourceMaps;
	private CDACDMap<IMedicationsInformation> cdMap;

	SectionResult() {
		bundle = new Bundle();
	}

	SectionResult(Bundle bundle) {
		this.bundle = bundle;
	}

	@Override
	public boolean hasDeferredReferences() {
		return deferredReferences != null && !deferredReferences.isEmpty();
	}

	public void addDeferredReferences(List<IDeferredReference> references) {
		if (deferredReferences == null) {
			deferredReferences = new ArrayList<IDeferredReference>();
		}
		deferredReferences.addAll(references);
	}

	@Override
	public List<IDeferredReference> getDeferredReferences() {
		return deferredReferences;
	}

	@Override
	public Bundle getBundle() {
		return bundle;
	}

	@Override
	public void updateFrom(IEntryResult entryResult) {
		entryResult.copyTo(bundle);
		if (entryResult.hasDeferredReferences()) {
			addDeferredReferences(entryResult.getDeferredReferences());
		}
		if (entryResult.hasIIMapValues()) {
			if (entities == null) {
				entities = new CDAIIMap<IEntityInfo>();
			}
			if (resourceMaps == null) {
				resourceMaps = new CDAIIResourceMaps<IBaseResource>();
			}

			if (cdMap == null) {
				cdMap = new CDACDMap<IMedicationsInformation>();
			}
			entities.put(entryResult);
			resourceMaps.put(entryResult);
			cdMap.put(entryResult);
		}
	}

	@Override
	public void putCDValuesTo(Map<String, IMedicationsInformation> target) {
		if (cdMap != null) {
			cdMap.putCDValuesTo(target);
		}

	}

	@Override
	public void putRootValuesTo(Map<String, IEntityInfo> target) {
		if (entities != null) {
			entities.putRootValuesTo(target);
		}
	}

	@Override
	public void putExtensionValuesTo(Map<String, Map<String, IEntityInfo>> target) {
		if (entities != null) {
			entities.putExtensionValuesTo(target);
		}
	}

	@Override
	public boolean hasEntities() {
		return entities != null;
	}

	@Override
	public boolean hasIIResourceMaps() {
		return resourceMaps != null;
	}

	@Override
	public boolean hasCDMap() {
		return cdMap != null;
	}

	@Override
	public boolean hasIIMapValues() {
		return entities != null || resourceMaps != null;
	}

	@Override
	public boolean hasResourceMaps() {
		return resourceMaps != null;
	}

	@Override
	public void putRootValuesTo(Class<? extends IBaseResource> clazz, Map<String, IBaseResource> target) {
		if (resourceMaps != null) {
			resourceMaps.putRootValuesTo(clazz, target);
		}
	}

	@Override
	public void putExtensionValuesTo(Class<? extends IBaseResource> clazz,
			Map<String, Map<String, IBaseResource>> target) {
		if (resourceMaps != null) {
			resourceMaps.putExtensionValuesTo(clazz, target);
		}
	}

	@Override
	public CDAIIMap<IBaseResource> getMap(Class<? extends IBaseResource> clazz) {
		return resourceMaps.getMap(clazz);
	}

	@Override
	public void putMap(Class<? extends IBaseResource> clazz, CDAIIMap<IBaseResource> map) {
		resourceMaps.putMap(clazz, map);
	}

	@Override
	public boolean hasCDMapValues() {
		return cdMap != null && cdMap.hasCDMapValues();
	}

	@Override
	public boolean hasMapValues() {
		return entities != null || resourceMaps != null || cdMap != null;
	}

	@Override
	public void putCDResource(CD cd, IMedicationsInformation resource) {
		cdMap.put(cd, resource);
	}

	@Override
	public void putIIResource(II ii, Class<? extends IBaseResource> clazz, IBaseResource resource) {
		resourceMaps.put(ii, clazz, resource);
	}

	@Override
	public void putIIResource(List<II> iis, Class<? extends IBaseResource> clazz, IBaseResource resource) {
		resourceMaps.put(iis, clazz, resource);
	}

	@Override
	public CDAIIResourceMaps<IBaseResource> getResourceMaps() {
		return resourceMaps;
	}

	@Override
	public Collection<Class<? extends IBaseResource>> keySet() {
		if (resourceMaps == null) {
			resourceMaps = new CDAIIResourceMaps<IBaseResource>();
		}
		return resourceMaps.keySet();
	}

}
