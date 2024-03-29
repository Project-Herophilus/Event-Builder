package io.connectedhealth.idaas.eventbuilder.converters.ccda.transform.entry;

import java.util.List;

import org.hl7.fhir.r4.model.Medication;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

public interface IMedicationsInformation {

	boolean containsMedication(CD cd, List<II> iis);

	void putMedication(Medication med, CD code, List<II> iis);

	Medication getMedication(CD cd, List<II> iis);

	void putMedication(Medication med, CD code);

}
