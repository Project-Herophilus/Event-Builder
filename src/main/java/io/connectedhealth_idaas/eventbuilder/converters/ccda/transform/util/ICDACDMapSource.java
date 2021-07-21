package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util;

import java.util.Map;

public interface ICDACDMapSource<T> {
	void putCDValuesTo(Map<String, T> hashCdMap);

	boolean hasCDMapValues();

}
