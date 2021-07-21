package io.connectedhealth_idaas.eventbuilder.pojos.platform;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import io.connectedhealth_idaas.eventbuilder.pojos.platform.MessageHeader;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object that represents user credentials
 *
 */
public class UserAccessCredentials {

	MessageHeader msgHeader;
	private String UserAuthCredentialType;
	private String UserAuthCredential;
	public String getUserAuthCredentialType() {
		return UserAuthCredentialType;
	}
	public void setUserAuthCredentialType(String userAuthCredentialType) {
		UserAuthCredentialType = userAuthCredentialType;
	}
	public String getUserAuthCredential() {
		return UserAuthCredential;
	}
	public void setUserAuthCredential(String userAuthCredential) {
		UserAuthCredential = userAuthCredential;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
