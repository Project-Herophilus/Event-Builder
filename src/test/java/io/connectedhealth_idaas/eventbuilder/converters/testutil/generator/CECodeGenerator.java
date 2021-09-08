package io.connectedhealth_idaas.eventbuilder.converters.testutil.generator;

import java.util.Map;

import org.openhealthtools.mdht.uml.hl7.datatypes.CE;

import io.connectedhealth_idaas.eventbuilder.converters.testutil.CDAFactories;

public class CECodeGenerator extends CodeGenerator<CE> {
	public CECodeGenerator(Map<String, Object> map, String defaultCode) {
		super(map, defaultCode);
	}

	public CECodeGenerator(Map<String, Object> map) {
		super(map);
	}

	@Override
	protected CE create(CDAFactories factories) {
		return factories.datatype.createCE();
	}
}
