package io.connectedhealth.idaas.hcdataobjects.general;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 *
 * Meant to provide an object to work with that represents insurance
 *
 */
public class Insurance {

  private String insuranceType;
  private String insurancePlanName;
  Address insurancePlanAddress;
  private String insurancePlanID;
  private String insurancePlanPhoneNumber;

  public String getInsuranceType() {
    return insuranceType;
  }

  public void setInsuranceType(String insuranceType) {
    this.insuranceType = insuranceType;
  }

  public String getInsurancePlanName() {
    return insurancePlanName;
  }

  public void setInsurancePlanName(String insurancePlanName) {
    this.insurancePlanName = insurancePlanName;
  }

  public String getInsurancePlanID() {
    return insurancePlanID;
  }

  public void setInsurancePlanID(String insurancePlanID) {
    this.insurancePlanID = insurancePlanID;
  }

  public String getInsurancePlanPhoneNumber() {
    return insurancePlanPhoneNumber;
  }

  public void setInsurancePlanPhoneNumber(String insurancePlanPhoneNumber) {
    this.insurancePlanPhoneNumber = insurancePlanPhoneNumber;
  }
  
//toString 
public String toString() 
{
		return ReflectionToStringBuilder.toString(this);
}
}
