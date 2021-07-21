package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.IResourceTransformer;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.entry.CDAIIResourceMaps;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.entry.IEntityInfo;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.entry.IEntityResult;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.entry.IMedicationsInformation;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.IIdentifierMap;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.IResult;

public class BundleInfo implements IBundleInfo {
	private IResourceTransformer resourceTransformer;
	private Map<String, String> idedAnnotations = new HashMap<String, String>();
	private IIdentifierMap<Reference> identifiedReferences = new IdentifierMap<Reference>();

	private CDAIIMap<IEntityInfo> entities = new CDAIIMap<IEntityInfo>();
	private CDAIIResourceMaps<IBaseResource> resourceMaps = new CDAIIResourceMaps<IBaseResource>();
	private CDACDMap<IMedicationsInformation> cdMap = new CDACDMap<IMedicationsInformation>();

	public BundleInfo(IResourceTransformer resourceTransformer) {
		this.resourceTransformer = resourceTransformer;
	}

	@Override
	public IResourceTransformer getResourceTransformer() {
		return resourceTransformer;
	}

	@Override
	public Map<String, String> getIdedAnnotations() {
		return idedAnnotations;
	}

	public void mergeIdedAnnotations(Map<String, String> newAnnotations) {
		idedAnnotations.putAll(newAnnotations);
	}

	@Override
	public Reference getReferenceByIdentifier(String fhirType, Identifier identifier) {
		return identifiedReferences.get(fhirType, identifier);
	}

	public void putReference(String fhirType, Identifier identifier, Reference reference) {
		identifiedReferences.put(fhirType, identifier, reference);
	}

	@Override
	public void updateFrom(IEntityResult entityResult) {
		List<II> iis = entityResult.getNewIds();
		if (iis != null) {
			entities.put(iis, entityResult.getInfo());
		}

		if (entityResult.hasIIResourceMaps()) {
			if (resourceMaps == null) {
				resourceMaps = new CDAIIResourceMaps<IBaseResource>();
			}
			resourceMaps.put(entityResult.getResourceMaps());
		}
	}

	@Override
	public void updateFrom(IResult source) {
		if (source.hasEntities()) {
			entities.put(source);
		}
		if (source.hasIIResourceMaps()) {
			resourceMaps.put(source);
		}
		if (source.hasCDMap()) {
			cdMap.put(source);
		}
	}

	@Override
	public IEntityInfo findEntityResult(II ii) {
		return entities.get(ii);
	}

	@Override
	public IEntityInfo findEntityResult(List<II> iis) {
		return entities.get(iis);
	}

	@Override
	public IBaseResource findResourceResult(II ii, Class<? extends IBaseResource> clazz) {
		return resourceMaps.get(ii, clazz);
	}

	@Override
	public IBaseResource findResourceResult(List<II> iis, Class<? extends IBaseResource> clazz) {
		return resourceMaps.get(iis, clazz);
	}

	@Override
	public IMedicationsInformation findResourceResult(CD cd) {
		return cdMap.get(cd);
	}

	@Override
	public CDAIIMap<IEntityInfo> getEntities() {
		return entities;
	}

	@Override
	public CDAIIResourceMaps<IBaseResource> getResourceMaps() {
		return resourceMaps;
	}

	@Override
	public CDACDMap<IMedicationsInformation> getCDMap() {
		return cdMap;
	}

}
