package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util;

import java.util.Map;

public interface ICDAIIMapSource<T> {

	void putRootValuesTo(Map<String, T> target);

	void putExtensionValuesTo(Map<String, Map<String, T>> target);

	boolean hasIIMapValues();

}
