package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.section;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;

public interface ICDASection {
	ISectionResult transform(IBundleInfo bundleInfo);
}
