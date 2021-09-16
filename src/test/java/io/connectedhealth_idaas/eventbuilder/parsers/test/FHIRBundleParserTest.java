package io.connectedhealth_idaas.eventbuilder.parsers.test;
import io.connectedhealth_idaas.eventbuilder.parsers.fhir.FHIRBundleParser;
import org.junit.jupiter.api.Test;

import static io.connectedhealth_idaas.eventbuilder.parsers.fhir.FHIRBundleParser.parseFHIRBundle;

import java.io.Console;
import java.util.ArrayList;


public class FHIRBundleParserTest {
    @Test
    public void parseFHIRBundles() {
        // Samples available from https://www.hl7.org/fhir/bundle-examples.html

        String fhirMessage = "{\n" +
                "  \"resourceType\": \"Bundle\",\n" +
                "  \"id\": \"bundle-references\",\n" +
                "  \"type\": \"collection\",\n" +
                "  \"entry\": [\n" +
                "    {\n" +
                "      \"fullUrl\": \"http://example.org/fhir/Patient/23\",\n" +
                "      \"resource\": {\n" +
                "        \"resourceType\": \"Patient\",\n" +
                "        \"id\": \"23\",\n" +
                "        \"text\": {\n" +
                "          \"status\": \"generated\",\n" +
                "          \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: 23</p><p><b>identifier</b>: 1234567</p></div>\"\n" +
                "        },\n" +
                "        \"identifier\": [\n" +
                "          {\n" +
                "            \"system\": \"http://example.org/ids\",\n" +
                "            \"value\": \"1234567\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"fullUrl\": \"urn:uuid:04121321-4af5-424c-a0e1-ed3aab1c349d\",\n" +
                "      \"resource\": {\n" +
                "        \"resourceType\": \"Patient\",\n" +
                "        \"text\": {\n" +
                "          \"status\": \"generated\",\n" +
                "          \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p></div>\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"fullUrl\": \"http://example.org/fhir/Observation/123\",\n" +
                "      \"resource\": {\n" +
                "        \"resourceType\": \"Observation\",\n" +
                "        \"id\": \"123\",\n" +
                "        \"text\": {\n" +
                "          \"status\": \"generated\",\n" +
                "          \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: 123</p><p><b>status</b>: final</p><p><b>code</b>: Glucose [Moles/volume] in Blood <span>(Details : {LOINC code '15074-8' = 'Glucose [Moles/volume] in Blood', given as 'Glucose [Moles/volume] in Blood'})</span></p><p><b>subject</b>: <a>Patient/23</a></p></div>\"\n" +
                "        },\n" +
                "        \"status\": \"final\",\n" +
                "        \"code\": {\n" +
                "          \"coding\": [\n" +
                "            {\n" +
                "              \"system\": \"http://loinc.org\",\n" +
                "              \"code\": \"15074-8\",\n" +
                "              \"display\": \"Glucose [Moles/volume] in Blood\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        \"subject\": {\n" +
                "          \"reference\": \"Patient/23\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"fullUrl\": \"http://example.org/fhir/Observation/124\",\n" +
                "      \"resource\": {\n" +
                "        \"resourceType\": \"Observation\",\n" +
                "        \"id\": \"124\",\n" +
                "        \"text\": {\n" +
                "          \"status\": \"generated\",\n" +
                "          \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: 124</p><p><b>status</b>: final</p><p><b>code</b>: Glucose [Moles/volume] in Blood <span>(Details : {LOINC code '15074-8' = 'Glucose [Moles/volume] in Blood', given as 'Glucose [Moles/volume] in Blood'})</span></p><p><b>subject</b>: <a>http://example.org/fhir/Patient/23</a></p></div>\"\n" +
                "        },\n" +
                "        \"status\": \"final\",\n" +
                "        \"code\": {\n" +
                "          \"coding\": [\n" +
                "            {\n" +
                "              \"system\": \"http://loinc.org\",\n" +
                "              \"code\": \"15074-8\",\n" +
                "              \"display\": \"Glucose [Moles/volume] in Blood\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        \"subject\": {\n" +
                "          \"reference\": \"http://example.org/fhir/Patient/23\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"fullUrl\": \"http://example.org/fhir/Observation/12\",\n" +
                "      \"resource\": {\n" +
                "        \"resourceType\": \"Observation\",\n" +
                "        \"id\": \"12\",\n" +
                "        \"text\": {\n" +
                "          \"status\": \"generated\",\n" +
                "          \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: 12</p><p><b>status</b>: final</p><p><b>code</b>: Glucose [Moles/volume] in Blood <span>(Details : {LOINC code '15074-8' = 'Glucose [Moles/volume] in Blood', given as 'Glucose [Moles/volume] in Blood'})</span></p><p><b>subject</b>: <a>urn:uuid:04121321-4af5-424c-a0e1-ed3aab1c349d</a></p></div>\"\n" +
                "        },\n" +
                "        \"status\": \"final\",\n" +
                "        \"code\": {\n" +
                "          \"coding\": [\n" +
                "            {\n" +
                "              \"system\": \"http://loinc.org\",\n" +
                "              \"code\": \"15074-8\",\n" +
                "              \"display\": \"Glucose [Moles/volume] in Blood\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        \"subject\": {\n" +
                "          \"reference\": \"urn:uuid:04121321-4af5-424c-a0e1-ed3aab1c349d\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"fullUrl\": \"http://example.org/fhir/Observation/14\",\n" +
                "      \"resource\": {\n" +
                "        \"resourceType\": \"Observation\",\n" +
                "        \"id\": \"14\",\n" +
                "        \"text\": {\n" +
                "          \"status\": \"generated\",\n" +
                "          \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: 14</p><p><b>status</b>: final</p><p><b>code</b>: Glucose [Moles/volume] in Blood <span>(Details : {LOINC code '15074-8' = 'Glucose [Moles/volume] in Blood', given as 'Glucose [Moles/volume] in Blood'})</span></p><p><b>subject</b>: <a>http://example.org/fhir-2/Patient/1</a></p></div>\"\n" +
                "        },\n" +
                "        \"status\": \"final\",\n" +
                "        \"code\": {\n" +
                "          \"coding\": [\n" +
                "            {\n" +
                "              \"system\": \"http://loinc.org\",\n" +
                "              \"code\": \"15074-8\",\n" +
                "              \"display\": \"Glucose [Moles/volume] in Blood\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        \"subject\": {\n" +
                "          \"reference\": \"http://example.org/fhir-2/Patient/1\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"fullUrl\": \"http://example.org/fhir-2/Observation/14\",\n" +
                "      \"resource\": {\n" +
                "        \"resourceType\": \"Observation\",\n" +
                "        \"id\": \"14\",\n" +
                "        \"text\": {\n" +
                "          \"status\": \"generated\",\n" +
                "          \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: 14</p><p><b>status</b>: final</p><p><b>code</b>: Glucose [Moles/volume] in Blood <span>(Details : {LOINC code '15074-8' = 'Glucose [Moles/volume] in Blood', given as 'Glucose [Moles/volume] in Blood'})</span></p><p><b>subject</b>: <a>Patient/23</a></p></div>\"\n" +
                "        },\n" +
                "        \"status\": \"final\",\n" +
                "        \"code\": {\n" +
                "          \"coding\": [\n" +
                "            {\n" +
                "              \"system\": \"http://loinc.org\",\n" +
                "              \"code\": \"15074-8\",\n" +
                "              \"display\": \"Glucose [Moles/volume] in Blood\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        \"subject\": {\n" +
                "          \"reference\": \"Patient/23\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"fullUrl\": \"http://example.org/fhir/Patient/45\",\n" +
                "      \"resource\": {\n" +
                "        \"resourceType\": \"Patient\",\n" +
                "        \"id\": \"45\",\n" +
                "        \"meta\": {\n" +
                "          \"versionId\": \"1\"\n" +
                "        },\n" +
                "        \"text\": {\n" +
                "          \"status\": \"generated\",\n" +
                "          \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: 45</p><p><b>meta</b>: </p><p><b>name</b>: Name 1</p></div>\"\n" +
                "        },\n" +
                "        \"name\": [\n" +
                "          {\n" +
                "            \"text\": \"Name 1\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"fullUrl\": \"http://example.org/fhir/Patient/45\",\n" +
                "      \"resource\": {\n" +
                "        \"resourceType\": \"Patient\",\n" +
                "        \"id\": \"45\",\n" +
                "        \"meta\": {\n" +
                "          \"versionId\": \"2\"\n" +
                "        },\n" +
                "        \"text\": {\n" +
                "          \"status\": \"generated\",\n" +
                "          \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: 45</p><p><b>meta</b>: </p><p><b>name</b>: Name 2</p></div>\"\n" +
                "        },\n" +
                "        \"name\": [\n" +
                "          {\n" +
                "            \"text\": \"Name 2\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"fullUrl\": \"http://example.org/fhir/Observation/47\",\n" +
                "      \"resource\": {\n" +
                "        \"resourceType\": \"Observation\",\n" +
                "        \"id\": \"47\",\n" +
                "        \"text\": {\n" +
                "          \"status\": \"generated\",\n" +
                "          \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: 47</p><p><b>status</b>: final</p><p><b>code</b>: Glucose [Moles/volume] in Blood <span>(Details : {LOINC code '15074-8' = 'Glucose [Moles/volume] in Blood', given as 'Glucose [Moles/volume] in Blood'})</span></p><p><b>subject</b>: <a>Patient/45/_history/2</a></p></div>\"\n" +
                "        },\n" +
                "        \"status\": \"final\",\n" +
                "        \"code\": {\n" +
                "          \"coding\": [\n" +
                "            {\n" +
                "              \"system\": \"http://loinc.org\",\n" +
                "              \"code\": \"15074-8\",\n" +
                "              \"display\": \"Glucose [Moles/volume] in Blood\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        \"subject\": {\n" +
                "          \"reference\": \"Patient/45/_history/2\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"fullUrl\": \"http://example.org/fhir/Observation/48\",\n" +
                "      \"resource\": {\n" +
                "        \"resourceType\": \"Observation\",\n" +
                "        \"id\": \"48\",\n" +
                "        \"text\": {\n" +
                "          \"status\": \"generated\",\n" +
                "          \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: 48</p><p><b>status</b>: final</p><p><b>code</b>: Glucose [Moles/volume] in Blood <span>(Details : {LOINC code '15074-8' = 'Glucose [Moles/volume] in Blood', given as 'Glucose [Moles/volume] in Blood'})</span></p><p><b>subject</b>: </p></div>\"\n" +
                "        },\n" +
                "        \"status\": \"final\",\n" +
                "        \"code\": {\n" +
                "          \"coding\": [\n" +
                "            {\n" +
                "              \"system\": \"http://loinc.org\",\n" +
                "              \"code\": \"15074-8\",\n" +
                "              \"display\": \"Glucose [Moles/volume] in Blood\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        \"subject\": {\n" +
                "          \"identifier\": {\n" +
                "            \"system\": \"http://example.org/ids\",\n" +
                "            \"value\": \"1234567\"\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        FHIRBundleParser fbp = new FHIRBundleParser();
        ArrayList<String> strData = parseFHIRBundle(fhirMessage);
        FHIRBundleParser fbp2 = new FHIRBundleParser();
    }
}
