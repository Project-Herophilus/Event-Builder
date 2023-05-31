package io.connectedhealth.idaas.hcdataobjects.common;

import java.util.List;

public class Resource {

    public String resourceType;
    public String id;
    public Meta meta;
    public Text text;
    public List<Identifier> identifier;
    public List<Type> type;
    public boolean active;
    public List<Name> name;
    public String gender;
    public String birthDate;
    public ManagingOrganization managingOrganization;

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public List<Identifier> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Name> getName() {
        return name;
    }

    public void setName(List<Name> name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public ManagingOrganization getManagingOrganization() {
        return managingOrganization;
    }

    public List<Type> getType() {
        return type;
    }

    public void setType(List<Type> type) {
        this.type = type;
    }

    public void setManagingOrganization(ManagingOrganization managingOrganization) {
        this.managingOrganization = managingOrganization;
    }
}
