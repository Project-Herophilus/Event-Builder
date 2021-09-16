package io.connectedhealth_idaas.eventbuilder.parsers.fhir;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.ArrayList;

public class FHIRBundleParser {

    public static ArrayList parseFHIRBundle(String fhirMessage)
    {
        ArrayList<String> outputData = new ArrayList<String>();

        Gson gsonObject = new Gson();
        JsonObject bundle = gsonObject.fromJson(fhirMessage, JsonObject.class);
        for (int i=0; i<= bundle.size();i++)
        {
            outputData.add(bundle.get("entry").toString());
        }

        return outputData;
    }
}
