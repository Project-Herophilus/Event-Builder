package io.connectedhealth_idaas.eventbuilder.converters.testutil.generator;

import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation;

import io.connectedhealth_idaas.eventbuilder.converters.testutil.CDAFactories;

public class VitalSignObservationGenerator extends ObservationGenerator {
	@Override
	public VitalSignObservation createForGenerate(CDAFactories factories) {
		return factories.consol.createVitalSignObservation();
	}

	public static VitalSignObservationGenerator getDefaultInstance() {
		VitalSignObservationGenerator rog = new VitalSignObservationGenerator();
		ObservationGenerator.fillDefaultInstance(rog);
		return rog;
	}
}
