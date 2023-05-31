package io.connectedhealth.idaas.hcdataobjects.common;

import io.connectedhealth.idaas.hcdataobjects.common.*;

import java.util.List;

public class Encounter {

    public String resourceType;
    public String idValue;
    public Text text;
    public String statusData;
    public List<StatusHistory> statusHistoryDetail;
    public Class classDetail;
    public List<ClassHistory> classHistory;
    public Subject subject;
    public Period period;
    public Hospitalization hospitalization;
    public List<Location> location;
    public Meta meta;
    public List<Type> type;

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public String getStatusData() {
        return statusData;
    }

    public void setStatusData(String statusData) {
        this.statusData = statusData;
    }

    public List<StatusHistory> getStatusHistoryDetail() {
        return statusHistoryDetail;
    }

    public void setStatusHistoryDetail(List<StatusHistory> statusHistoryDetail) {
        this.statusHistoryDetail = statusHistoryDetail;
    }

    public Class getClassDetail() {
        return classDetail;
    }

    public void setClassDetail(Class classDetail) {
        this.classDetail = classDetail;
    }

    public List<ClassHistory> getClassHistory() {
        return classHistory;
    }

    public void setClassHistory(List<ClassHistory> classHistory) {
        this.classHistory = classHistory;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Hospitalization getHospitalization() {
        return hospitalization;
    }

    public void setHospitalization(Hospitalization hospitalization) {
        this.hospitalization = hospitalization;
    }

    public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
        this.location = location;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Type> getType() {
        return type;
    }

    public void setType(List<Type> type) {
        this.type = type;
    }
}
