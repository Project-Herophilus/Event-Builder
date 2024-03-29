package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util;

import java.util.List;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.impl.IdentifierMap;
import org.hl7.fhir.r4.model.Base;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Property;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.exceptions.FHIRException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IdentifierMapFactory {
	interface ResourceInfo<T> {
		T get(Resource resource);
	}

	private final static Logger logger = LoggerFactory.getLogger(IdentifierMapFactory.class);

	public static <T> IIdentifierMap<T> bundleToResourceInfo(Bundle bundle, ResourceInfo<T> resourceInfo) {
		IdentifierMap<T> identifierMap = new IdentifierMap<T>();
		for (BundleEntryComponent entry : bundle.getEntry()) {
			Resource resource = entry.getResource();
			Property property = resource.getNamedProperty("identifier");
			if (property != null) {
				List<Base> bases = property.getValues();
				if (!bases.isEmpty()) {
					for (Base base : bases) {
						try {
							if (base != null) {
								Identifier identifier = resource.castToIdentifier(base);
								String fhirType = resource.fhirType();
								T info = resourceInfo.get(resource);
								if (info != null) {
									identifierMap.put(fhirType, identifier, info);
								}
							}
						} catch (FHIRException e) {
						}
					}
				}
			}
		}
		return identifierMap;
	}

	public static <T> IIdentifierMap<T> resourcesToResourceInfo(List<? extends Resource> resources,
			ResourceInfo<T> resourceInfo) {
		IdentifierMap<T> identifierMap = new IdentifierMap<T>();
		for (Resource resource : resources) {
			Property property = resource.getNamedProperty("identifier");
			if (property != null) {
				List<Base> bases = property.getValues();
				if (!bases.isEmpty()) {
					for (Base base : bases) {
						try {
							Identifier identifier = resource.castToIdentifier(base);
							String fhirType = resource.fhirType();
							T info = resourceInfo.get(resource);
							if (info != null) {
								identifierMap.put(fhirType, identifier, info);
							}
						} catch (FHIRException e) {
						}
					}
				}
			}
		}
		return identifierMap;
	}

	public static IdentifierMap<Integer> resourcesToOrder(List<? extends Resource> resources) {
		IdentifierMap<Integer> result = new IdentifierMap<Integer>();
		for (int index = 0; index < resources.size(); ++index) {
			Resource resource = resources.get(index);
			Property property = resource.getNamedProperty("identifier");
			if (property == null) {
				logger.warn("No identifier. Cannot be ordered");
			}
			for (Base base : property.getValues()) {
				Identifier identifier = resource.castToIdentifier(base);
				result.put(resource.fhirType(), identifier, index);
			}
		}
		return result;
	}

	public static IIdentifierMap<String> bundleToIds(Bundle bundle) {
		return bundleToResourceInfo(bundle, r -> r.getId());
	}

	public static IIdentifierMap<Resource> bundleToResource(Bundle bundle) {
		return bundleToResourceInfo(bundle, r -> r);
	}
}
