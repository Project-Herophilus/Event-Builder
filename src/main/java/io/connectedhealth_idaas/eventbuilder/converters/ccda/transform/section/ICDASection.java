package io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.section;

import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.util.IBundleInfo;

public interface ICDASection {
	ISectionResult transform(IBundleInfo bundleInfo);
}
