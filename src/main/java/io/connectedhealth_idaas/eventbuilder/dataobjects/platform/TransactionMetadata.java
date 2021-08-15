/*
 * Copyright 2019 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package io.connectedhealth_idaas.eventbuilder.dataobjects.platform;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TransactionMetadata {

  MessageHeader msgHeader;
  private String platformModule;
  private String processingComponent;
  private String processingState;
  private String processingStatus;
  private String industryStd;

  public String getPlatformModule() {
    return platformModule;
  }

  public void setPlatformModule(String platformModule) {
    this.platformModule = platformModule;
  }

  public String getProcessingComponent() {
    return processingComponent;
  }

  public void setProcessingComponent(String processingComponent) {
    this.processingComponent = processingComponent;
  }

  public String getProcessingState() {
    return processingState;
  }

  public void setProcessingState(String processingState) {
    this.processingState = processingState;
  }

  public String getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
  }

public String getIndustryStd() {
	return industryStd;
}

public void setIndustryStd(String industryStd) {
	this.industryStd = industryStd;
}

//toString 
public String toString() 
{
	return ReflectionToStringBuilder.toString(this);
}
}
