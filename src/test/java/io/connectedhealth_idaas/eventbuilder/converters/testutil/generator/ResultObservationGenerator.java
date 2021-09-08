package io.connectedhealth_idaas.eventbuilder.converters.testutil.generator;

import org.openhealthtools.mdht.uml.cda.consol.ResultObservation;

import io.connectedhealth_idaas.eventbuilder.converters.testutil.CDAFactories;

public class ResultObservationGenerator extends ObservationGenerator {
	@Override
	public ResultObservation createForGenerate(CDAFactories factories) {
		return factories.consol.createResultObservation();
	}

	public static ResultObservationGenerator getDefaultInstance() {
		ResultObservationGenerator rog = new ResultObservationGenerator();
		ObservationGenerator.fillDefaultInstance(rog);
		return rog;
	}
}
