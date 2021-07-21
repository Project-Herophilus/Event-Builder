package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util;

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
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.impl.CDACDMap;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.impl.CDAIIMap;

public interface IBundleInfo {
	IResourceTransformer getResourceTransformer();

	Map<String, String> getIdedAnnotations();

	Reference getReferenceByIdentifier(String fhirType, Identifier identifier);

	IEntityInfo findEntityResult(II ii);

	IEntityInfo findEntityResult(List<II> iis);

	IBaseResource findResourceResult(II ii, Class<? extends IBaseResource> clazz);

	IBaseResource findResourceResult(List<II> iis, Class<? extends IBaseResource> clazz);

	public IMedicationsInformation findResourceResult(CD cd);

	public void updateFrom(IResult source);

	public void updateFrom(IEntityResult entityResult);

	public CDAIIMap<IEntityInfo> getEntities();

	public CDAIIResourceMaps<IBaseResource> getResourceMaps();

	public CDACDMap<IMedicationsInformation> getCDMap();
}
