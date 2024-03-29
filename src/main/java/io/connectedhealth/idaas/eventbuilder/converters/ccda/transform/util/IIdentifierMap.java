package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util;

import java.util.List;
import java.util.Map;

import org.hl7.fhir.r4.model.Identifier;

public interface IIdentifierMap<T> {
	void put(String fhirType, Identifier identifier, T identifiedValue);

	void put(String fhirType, String system, String value, T identifiedValue);

	void put(String fhirType, List<Identifier> identifiers, T identifiedValue);

	T get(String fhirType, Identifier identifier);

	T get(String fhirType, String value);

	T get(String fhirType, String system, String value);

	T getFromJSONArray(String fhirType, List<Object> identifiers);

	T getFromJSONArray(String fhirType, Map<String, Object> identifier);
}
