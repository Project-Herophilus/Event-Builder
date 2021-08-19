package io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common;

import java.util.List;

public class Contained {
    public String resourceType;
    public String id;
    public String name;
    public String status;
    public String description;
    public Expansion expansion;
    public List<Identifier> identifier;
    public boolean active;
    public List<Name> nameDetail;
    public String gender;
    public String birthDate;
    public BirthDate _birthDate;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Expansion getExpansion() {
        return expansion;
    }

    public void setExpansion(Expansion expansion) {
        this.expansion = expansion;
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

    public List<Name> getNameDetail() {
        return nameDetail;
    }

    public void setNameDetail(List<Name> nameDetail) {
        this.nameDetail = nameDetail;
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

    public BirthDate get_birthDate() {
        return _birthDate;
    }

    public void set_birthDate(BirthDate _birthDate) {
        this._birthDate = _birthDate;
    }
}
