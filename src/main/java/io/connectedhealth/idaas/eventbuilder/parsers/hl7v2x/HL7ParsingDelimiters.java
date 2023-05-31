/**
 * 
 */
package io.connectedhealth.idaas.eventbuilder.parsers.hl7v2x;

import io.connectedhealth.idaas.eventbuilder.builders.hl7.common.HL7MessageDelimiters;

/**
 * @author Alan Scott 
 * 
 * 	Designed for being able to support HL7 Parsing attributes 
 *
 */
public class HL7ParsingDelimiters {

	public static HL7MessageDelimiters buildDelimiters(String segmentData)
	{
		HL7MessageDelimiters hl7Delimiters = new HL7MessageDelimiters();

		return hl7Delimiters;
	}
}
