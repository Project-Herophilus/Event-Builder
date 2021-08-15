package io.connectedhealth_idaas.eventbuilder.dataobjects.platform;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

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
