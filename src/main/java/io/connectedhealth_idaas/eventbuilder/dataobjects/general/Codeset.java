package io.connectedhealth_idaas.eventbuilder.dataobjects.general;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Codeset {
    private String codeSystemID;
    private String codeValue;
    private String displayName;
    private String codingSystemName;
    private String alternativeIdentifier;
    private String codingSystemVersionId;
    private String industryStd;
    private String originalText;
    private String codeLocation;
    private String codeType;
    private String applicationName;
    private String organizationName;

    public String getCodeSystemID() {
        return codeSystemID;
    }

    public void setCodeSystemID(String codeSystemID) {
        this.codeSystemID = codeSystemID;
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCodingSystemName() {
        return codingSystemName;
    }

    public void setCodingSystemName(String codingSystemName) {
        this.codingSystemName = codingSystemName;
    }

    public String getAlternativeIdentifier() {
        return alternativeIdentifier;
    }

    public void setAlternativeIdentifier(String alternativeIdentifier) {
        this.alternativeIdentifier = alternativeIdentifier;
    }

    public String getCodingSystemVersionId() {
        return codingSystemVersionId;
    }

    public void setCodingSystemVersionId(String codingSystemVersionId) {
        this.codingSystemVersionId = codingSystemVersionId;
    }

    public String getIndustryStd() {
        return industryStd;
    }

    public void setIndustryStd(String industryStd) {
        this.industryStd = industryStd;
    }

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public String getCodeLocation() {
        return codeLocation;
    }

    public void setCodeLocation(String codeLocation) {
        this.codeLocation = codeLocation;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
