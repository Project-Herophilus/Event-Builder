package io.connectedhealth.idaas.eventbuilder.converters.ccda.pipeline_wrapper;

import java.io.FileInputStream;

import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.CCDTransformerImpl;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.util.FHIRUtil;
import io.connectedhealth.idaas.eventbuilder.converters.ccda.util.IdGeneratorEnum;

public class Wrapper {

	public static void main(String[] args) throws Exception {
		final Logger logger = LoggerFactory.getLogger(Wrapper.class);
		if (args.length > 1) {
			CDAUtil.loadPackages();

			FileInputStream fis = new FileInputStream(args[0]);
			ContinuityOfCareDocument cda = (ContinuityOfCareDocument) CDAUtil.loadAs(fis,
					ConsolPackage.eINSTANCE.getContinuityOfCareDocument());

			CCDTransformerImpl ccdTransformer = new CCDTransformerImpl(IdGeneratorEnum.UUID);
			Bundle bundle =  ccdTransformer.transformDocument(cda, BundleType.TRANSACTION, null, null, null);
			FHIRUtil.printJSON(bundle, args[1]);
		} else {
			logger.error("Wrapper run without arguments");

		}

	}

}
