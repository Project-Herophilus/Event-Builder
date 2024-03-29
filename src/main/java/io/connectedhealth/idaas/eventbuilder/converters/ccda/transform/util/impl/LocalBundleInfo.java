package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.IEntityResult;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.IResourceTransformer;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.CDAIIResourceMaps;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.IEntityInfo;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry.IMedicationsInformation;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.IResult;

public class LocalBundleInfo implements IBundleInfo {
	private IBundleInfo bundleInfo;
	private CDAIIMap<IEntityInfo> entities = new CDAIIMap<IEntityInfo>();
	private CDAIIResourceMaps<IBaseResource> resourceMaps = new CDAIIResourceMaps<IBaseResource>();
	private CDACDMap<IMedicationsInformation> cdMap = new CDACDMap<IMedicationsInformation>();

	public LocalBundleInfo(IBundleInfo bundleInfo) {
		this.bundleInfo = bundleInfo;
		entities.put(bundleInfo.getEntities());
		resourceMaps.put(bundleInfo.getResourceMaps());
		cdMap.put(bundleInfo.getCDMap());

	}

	@Override
	public IResourceTransformer getResourceTransformer() {
		return bundleInfo.getResourceTransformer();
	}

	@Override
	public Map<String, String> getIdedAnnotations() {
		return bundleInfo.getIdedAnnotations();
	}

	@Override
	public Reference getReferenceByIdentifier(String fhirType, Identifier identifier) {
		return bundleInfo.getReferenceByIdentifier(fhirType, identifier);
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
	public IEntityInfo findEntityResult(II ii) {
		IEntityInfo result = bundleInfo.findEntityResult(ii);
		if (result == null) {
			return entities.get(ii);
		}

		return result;
	}

	@Override
	public IEntityInfo findEntityResult(List<II> iis) {
		IEntityInfo result = bundleInfo.findEntityResult(iis);
		if (result == null) {
			return entities.get(iis);
		}
		return result;
	}

	@Override
	public IBaseResource findResourceResult(II ii, Class<? extends IBaseResource> clazz) {
		IBaseResource result = bundleInfo.findResourceResult(ii, clazz);
		if (result == null) {
			return resourceMaps.get(ii, clazz);
		}
		return result;
	}

	@Override
	public IBaseResource findResourceResult(List<II> iis, Class<? extends IBaseResource> clazz) {
		IBaseResource result = bundleInfo.findResourceResult(iis, clazz);
		if (result == null) {
			return resourceMaps.get(iis, clazz);
		}
		return result;
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

	@Override
	public Map<String, ManufacturedProduct> getMedicationDedupMap() {
		return bundleInfo.getMedicationDedupMap();
	}

	@Override
	public Set<String> getOrganizationnDedupMap() {
		return bundleInfo.getOrganizationnDedupMap();
	}
}
