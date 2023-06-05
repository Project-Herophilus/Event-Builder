package io.connectedhealth.idaas.hcdataobjects.hl7v3;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
public class POCD_Header {
    private String realmCode;
    private String typeID;
    private String templateID;
    private String idCode;
    private String CodeValue;
    private String textValue;
    private String statusCode;
    private String effectiveTime;
    private String priorityCode;
    private String languageCode;
    private String subject;
    private String specimen;
    private String performer;
    private String author;
    private String informant;
    private String participant;
    private String entityRelationship;
    private String referenceValue;
    private String preCondition;
    private String classCode;
    private String moodCode;
    private String negationInd;

    public String getRealmCode() {
        return realmCode;
    }

    public void setRealmCode(String realmCode) {
        this.realmCode = realmCode;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public String getTemplateID() {
        return templateID;
    }

    public void setTemplateID(String templateID) {
        this.templateID = templateID;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getCodeValue() {
        return CodeValue;
    }

    public void setCodeValue(String codeValue) {
        CodeValue = codeValue;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getPriorityCode() {
        return priorityCode;
    }

    public void setPriorityCode(String priorityCode) {
        this.priorityCode = priorityCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSpecimen() {
        return specimen;
    }

    public void setSpecimen(String specimen) {
        this.specimen = specimen;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInformant() {
        return informant;
    }

    public void setInformant(String informant) {
        this.informant = informant;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public String getEntityRelationship() {
        return entityRelationship;
    }

    public void setEntityRelationship(String entityRelationship) {
        this.entityRelationship = entityRelationship;
    }

    public String getReferenceValue() {
        return referenceValue;
    }

    public void setReferenceValue(String referenceValue) {
        this.referenceValue = referenceValue;
    }

    public String getPreCondition() {
        return preCondition;
    }

    public void setPreCondition(String preCondition) {
        this.preCondition = preCondition;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getMoodCode() {
        return moodCode;
    }

    public void setMoodCode(String moodCode) {
        this.moodCode = moodCode;
    }

    public String getNegationInd() {
        return negationInd;
    }

    public void setNegationInd(String negationInd) {
        this.negationInd = negationInd;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
