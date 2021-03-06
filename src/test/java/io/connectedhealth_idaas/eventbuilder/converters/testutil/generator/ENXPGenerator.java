package io.connectedhealth_idaas.eventbuilder.converters.testutil.generator;

import org.openhealthtools.mdht.uml.hl7.datatypes.ENXP;

import io.connectedhealth_idaas.eventbuilder.converters.testutil.CDAFactories;

public class ENXPGenerator extends BaseStringGenerator<ENXP> {
	public ENXPGenerator(boolean nullFlavorOK) {
		super(nullFlavorOK);
	}

	public ENXPGenerator(String value) {
		super(value);
	}

	public ENXPGenerator(String value, boolean nullFlavorOK) {
		super(value, nullFlavorOK);
	}

	@Override
	public ENXP create(CDAFactories factories) {
		return factories.datatype.createENXP();
	}

	public static ENXPGenerator getNextInstance(boolean nullFlavorOK) {
		String value = BaseStringGenerator.getNextValue();
		return new ENXPGenerator(value, nullFlavorOK);
	}
}
