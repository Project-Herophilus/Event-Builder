package io.connectedhealth.idaas.eventbuilder.parsers.test;

import io.connectedhealth.idaas.eventbuilder.parsers.fhir.FHIRGenericParsing;
import org.junit.jupiter.api.Test;

import static io.connectedhealth.idaas.eventbuilder.parsers.fhir.FHIRGenericParsing.parseFHIRMessage;

public class FHIRParserTest {
    @Test
    public void parseFHIRTerminologies() {
        String msgBody = "{\n" +
                "  \"resourceType\": \"AllergyIntolerance\",\n" +
                "  \"id\": \"example\",\n" +
                "  \"text\": {\n" +
                "    \"status\": \"generated\",\n" +
                "    \"div\": \"\\u003cdiv xmlns\\u003d\\\"http://www.w3.org/1999/xhtml\\\"\\u003e\\u003cp\\u003e\\u003cb\\u003eGenerated Narrative with Details\\u003c/b\\u003e\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003eid\\u003c/b\\u003e: example\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003eidentifier\\u003c/b\\u003e: 49476534\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003eclinicalStatus\\u003c/b\\u003e: Active \\u003cspan\\u003e(Details : {http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical code \\u0027active\\u0027 \\u003d \\u0027Active\\u0027, given as \\u0027Active\\u0027})\\u003c/span\\u003e\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003everificationStatus\\u003c/b\\u003e: Confirmed \\u003cspan\\u003e(Details : {http://terminology.hl7.org/CodeSystem/allergyintolerance-verification code \\u0027confirmed\\u0027 \\u003d \\u0027Confirmed\\u0027, given as \\u0027Confirmed\\u0027})\\u003c/span\\u003e\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003etype\\u003c/b\\u003e: allergy\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003ecategory\\u003c/b\\u003e: food\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003ecriticality\\u003c/b\\u003e: high\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003ecode\\u003c/b\\u003e: Cashew nuts \\u003cspan\\u003e(Details : {SNOMED CT code \\u0027227493005\\u0027 \\u003d \\u0027Cashew nuts\\u0027, given as \\u0027Cashew nuts\\u0027})\\u003c/span\\u003e\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003epatient\\u003c/b\\u003e: \\u003ca\\u003ePatient/example\\u003c/a\\u003e\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003eonset\\u003c/b\\u003e: 01/01/2004\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003erecordedDate\\u003c/b\\u003e: 09/10/2014 2:58:00 PM\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003erecorder\\u003c/b\\u003e: \\u003ca\\u003ePractitioner/example\\u003c/a\\u003e\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003easserter\\u003c/b\\u003e: \\u003ca\\u003ePatient/example\\u003c/a\\u003e\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003elastOccurrence\\u003c/b\\u003e: 01/06/2012\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003enote\\u003c/b\\u003e: The criticality is high becasue of the observed anaphylactic reaction when challenged with cashew extract.\\u003c/p\\u003e\\u003cblockquote\\u003e\\u003cp\\u003e\\u003cb\\u003ereaction\\u003c/b\\u003e\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003esubstance\\u003c/b\\u003e: cashew nut allergenic extract Injectable Product \\u003cspan\\u003e(Details : {RxNorm code \\u00271160593\\u0027 \\u003d \\u0027cashew nut allergenic extract Injectable Product\\u0027, given as \\u0027cashew nut allergenic extract Injectable Product\\u0027})\\u003c/span\\u003e\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003emanifestation\\u003c/b\\u003e: Anaphylactic reaction \\u003cspan\\u003e(Details : {SNOMED CT code \\u002739579001\\u0027 \\u003d \\u0027Anaphylaxis\\u0027, given as \\u0027Anaphylactic reaction\\u0027})\\u003c/span\\u003e\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003edescription\\u003c/b\\u003e: Challenge Protocol. Severe reaction to subcutaneous cashew extract. Epinephrine administered\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003eonset\\u003c/b\\u003e: 12/06/2012\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003eseverity\\u003c/b\\u003e: severe\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003eexposureRoute\\u003c/b\\u003e: Subcutaneous route \\u003cspan\\u003e(Details : {SNOMED CT code \\u002734206005\\u0027 \\u003d \\u0027Subcutaneous route\\u0027, given as \\u0027Subcutaneous route\\u0027})\\u003c/span\\u003e\\u003c/p\\u003e\\u003c/blockquote\\u003e\\u003cblockquote\\u003e\\u003cp\\u003e\\u003cb\\u003ereaction\\u003c/b\\u003e\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003emanifestation\\u003c/b\\u003e: Urticaria \\u003cspan\\u003e(Details : {SNOMED CT code \\u002764305001\\u0027 \\u003d \\u0027Urticaria\\u0027, given as \\u0027Urticaria\\u0027})\\u003c/span\\u003e\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003eonset\\u003c/b\\u003e: 01/01/2004\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003eseverity\\u003c/b\\u003e: moderate\\u003c/p\\u003e\\u003cp\\u003e\\u003cb\\u003enote\\u003c/b\\u003e: The patient reports that the onset of urticaria was within 15 minutes of eating cashews.\\u003c/p\\u003e\\u003c/blockquote\\u003e\\u003c/div\\u003e\"\n" +
                "  },\n" +
                "  \"identifier\": [\n" +
                "    {\n" +
                "      \"system\": \"http://acme.com/ids/patients/risks\",\n" +
                "      \"value\": \"49476534\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"clinicalStatus\": {\n" +
                "    \"coding\": [\n" +
                "      {\n" +
                "        \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" +
                "        \"code\": \"active\",\n" +
                "        \"display\": \"Active\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"verificationStatus\": {\n" +
                "    \"coding\": [\n" +
                "      {\n" +
                "        \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" +
                "        \"code\": \"confirmed\",\n" +
                "        \"display\": \"Confirmed\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"type\": \"allergy\",\n" +
                "  \"category\": [\n" +
                "    \"food\"\n" +
                "  ],\n" +
                "  \"criticality\": \"high\",\n" +
                "  \"code\": {\n" +
                "    \"coding\": [\n" +
                "      {\n" +
                "        \"system\": \"http://snomed.info/sct\",\n" +
                "        \"code\": \"227493005\",\n" +
                "        \"display\": \"Cashew nuts\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"patient\": {\n" +
                "    \"reference\": \"Patient/example\"\n" +
                "  },\n" +
                "  \"onsetDateTime\": \"2004\",\n" +
                "  \"recordedDate\": \"2014-10-09T14:58:00+11:00\",\n" +
                "  \"recorder\": {\n" +
                "    \"reference\": \"Practitioner/example\"\n" +
                "  },\n" +
                "  \"asserter\": {\n" +
                "    \"reference\": \"Patient/example\"\n" +
                "  },\n" +
                "  \"lastOccurrence\": \"2012-06\",\n" +
                "  \"note\": [\n" +
                "    {\n" +
                "      \"text\": \"The criticality is high becasue of the observed anaphylactic reaction when challenged with cashew extract.\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"reaction\": [\n" +
                "    {\n" +
                "      \"substance\": {\n" +
                "        \"coding\": [\n" +
                "          {\n" +
                "            \"system\": \"http://www.nlm.nih.gov/research/umls/rxnorm\",\n" +
                "            \"code\": \"1160593\",\n" +
                "            \"display\": \"cashew nut allergenic extract Injectable Product\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"manifestation\": [\n" +
                "        {\n" +
                "          \"coding\": [\n" +
                "            {\n" +
                "              \"system\": \"http://snomed.info/sct\",\n" +
                "              \"code\": \"39579001\",\n" +
                "              \"display\": \"Anaphylactic reaction\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"description\": \"Challenge Protocol. Severe reaction to subcutaneous cashew extract. Epinephrine administered\",\n" +
                "      \"onset\": \"2012-06-12\",\n" +
                "      \"severity\": \"severe\",\n" +
                "      \"exposureRoute\": {\n" +
                "        \"coding\": [\n" +
                "          {\n" +
                "            \"system\": \"http://snomed.info/sct\",\n" +
                "            \"code\": \"34206005\",\n" +
                "            \"display\": \"Subcutaneous route\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"manifestation\": [\n" +
                "        {\n" +
                "          \"coding\": [\n" +
                "            {\n" +
                "              \"system\": \"http://snomed.info/sct\",\n" +
                "              \"code\": \"64305001\",\n" +
                "              \"display\": \"Urticaria\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"onset\": \"2004\",\n" +
                "      \"severity\": \"moderate\",\n" +
                "      \"note\": [\n" +
                "        {\n" +
                "          \"text\": \"The patient reports that the onset of urticaria was within 15 minutes of eating cashews.\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"meta\": {\n" +
                "    \"tag\": [\n" +
                "      {\n" +
                "        \"system\": \"http://terminology.hl7.org/CodeSystem/v3-ActReason\",\n" +
                "        \"code\": \"HTEST\",\n" +
                "        \"display\": \"test health data\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";

        FHIRGenericParsing parser = new FHIRGenericParsing();
        String fhirResourceName="AllergyIntolerence";
        parseFHIRMessage(fhirResourceName, msgBody);
    }
}
