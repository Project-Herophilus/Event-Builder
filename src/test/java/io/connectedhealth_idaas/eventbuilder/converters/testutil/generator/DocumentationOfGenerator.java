package io.connectedhealth_idaas.eventbuilder.converters.testutil.generator;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Composition.CompositionEventComponent;
import org.junit.Assert;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;

import io.connectedhealth_idaas.eventbuilder.converters.testutil.CDAFactories;

public class DocumentationOfGenerator {
	private ServiceEventGenerator eventGenerator;

	public DocumentationOf generate(CDAFactories factories) {
		DocumentationOf docOf = factories.base.createDocumentationOf();

		if (eventGenerator != null) {
			ServiceEvent se = eventGenerator.generate(factories);
			docOf.setServiceEvent(se);
		}

		return docOf;
	}

	public static DocumentationOfGenerator getDefaultInstance() {
		DocumentationOfGenerator g = new DocumentationOfGenerator();
		g.eventGenerator = ServiceEventGenerator.getDefaultInstance();
		return g;
	}

	public void verify(Bundle bundle, CompositionEventComponent event) throws Exception {
		if (eventGenerator == null) {
			Assert.assertNull("No event", event);
		} else {
			eventGenerator.verify(bundle, event);
		}
	}
}
