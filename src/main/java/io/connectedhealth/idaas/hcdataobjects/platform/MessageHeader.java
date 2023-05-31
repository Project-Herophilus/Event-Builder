package io.connectedhealth.idaas.hcdataobjects.platform;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import io.connectedhealth.idaas.hcdataobjects.general.Application;
import io.connectedhealth.idaas.hcdataobjects.general.Organization;

import java.util.List;

/*
 * @author Alan Scott
 *
 * Meant to provide an object to work with that represents a message header
 * There is no specific industry std as this is intended to be universal across all standards
 *
 */
public class MessageHeader {

  private String sendingApp;
  private String facilityId;
  private String messageDateTime;
  private String messageDate;
  private String messageTime;
  private String messageHour;
  private String messageType;
  private String messageEvent;
  private String messageId;
  private String uniqueMessageId;
  private String messageVersion;
  private String messageVendor;
  private String industryStd;
  private List<Application> applications;
  private List<Organization> organization;


  public String getSendingApp() {
    return sendingApp;
  }

  public void setSendingApp(String sendingApp) {
    this.sendingApp = sendingApp;
  }

  public String getFacilityId() {
    return facilityId;
  }

  public void setFacilityId(String facilityId) {
    this.facilityId = facilityId;
  }

  public String getMessageDateTime() {
    return messageDateTime;
  }

  public void setMessageDateTime(String messageDateTime) {
    this.messageDateTime = messageDateTime;
  }

  public String getMessageDate() {
	return messageDate;
}

public void setMessageDate(String messageDate) {
	this.messageDate = messageDate;
}

public String getMessageTime() {
	return messageTime;
}

public void setMessageTime(String messageTime) {
	this.messageTime = messageTime;
}

public String getMessageHour() {
	return messageHour;
}

public void setMessageHour(String messageHour) {
	this.messageHour = messageHour;
}

public String getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public String getMessageEvent() {
    return messageEvent;
  }

  public void setMessageEvent(String messageEvent) {
    this.messageEvent = messageEvent;
  }

  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public String getUniqueMessageId() {
    return uniqueMessageId;
  }

  public void setUniqueMessageId(String uniqueMessageId) {
    this.uniqueMessageId = uniqueMessageId;
  }

  public String getMessageVersion() {
    return messageVersion;
  }

  public void setMessageVersion(String messageVersion) {
    this.messageVersion = messageVersion;
  }

  public String getMessageVendor() {
    return messageVendor;
  }

  public void setMessageVendor(String messageVendor) {
    this.messageVendor = messageVendor;
  }

  public String getIndustryStd() {
    return industryStd;
  }

  public void setIndustryStd(String industryStd) {
    this.industryStd = industryStd;
  }

  public List<Application> getApplications() {
    return applications;
  }

  public void setApplications(List<Application> applications) {
    this.applications = applications;
  }

  public List<Organization> getOrganization() {
    return organization;
  }

  public void setOrganization(List<Organization> organization) {
    this.organization = organization;
  }

  //toString
public String toString() 
{
	return ReflectionToStringBuilder.toString(this);
}
}
