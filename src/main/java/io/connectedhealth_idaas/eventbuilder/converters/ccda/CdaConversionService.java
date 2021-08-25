package io.connectedhealth_idaas.eventbuilder.converters.ccda;

import ca.uhn.fhir.parser.IParser;
// import lombok.Data;
// import lombok.NonNull;
// import lombok.extern.slf4j.Slf4j;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Identifier;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
// import org.springframework.stereotype.Service;
//Move to parser package
// import org.transparenthealth.cda2fhirservice.exceptions.CdaTransformException;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.conf.Config;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.CCDTransformerImpl;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.transform.ICDATransformer;
import io.connectedhealth_idaas.eventbuilder.converters.ccda.util.IdGeneratorEnum;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

// @Service
// @Data
// @Slf4j
public class CdaConversionService {
  public String getFhirJsonFromCdaXMLString(String cdaXML) {
    InputStream cdaStringToInputStream = new ByteArrayInputStream(cdaXML.getBytes(Charset.forName("UTF-8")));

    ContinuityOfCareDocument ccd;
    String fhir = "";
    try {
      ccd = (ContinuityOfCareDocument) CDAUtil.loadAs(cdaStringToInputStream, ConsolPackage.eINSTANCE.getContinuityOfCareDocument());

      ICDATransformer ccdTransformer = new CCDTransformerImpl(IdGeneratorEnum.COUNTER);
      Config.setGenerateDafProfileMetadata(true);

      /**
       *  NOTE: this may not be necessary, its in their online docs, but it forces to the search for a
       *        customnarrative.properties file, which i just added as a blank file to solve the problem
       */
      //Config.setGenerateNarrative(true);

      Identifier identifier = new Identifier();
      identifier.setValue("Data Processing Engine");

      Bundle bundle = ccdTransformer.transformDocument(ccd, cdaXML, identifier);
      try{
        org.hl7.fhir.r4.model.Bundle bundleR4 = org.hl7.fhir.convertors.conv30_40.resources30_40.Bundle30_40.convertBundle(bundle);
        System.out.println("New R4 Bundle" + bundleR4.toString());
      }
      catch(Exception e){
        System.out.println("Exception" + e);
      }
      IParser jsonParser = Config.getFhirContext().newJsonParser();
      fhir = jsonParser.encodeResourceToString(bundle);
    } catch (Exception e) {
      // log.error("Caught an exception trying to deserialize the cda xml.", e);
      // throw new CdaTransformException("Error trying to parse CDA XML", e.getCause());
    }

    return fhir;
  }
}