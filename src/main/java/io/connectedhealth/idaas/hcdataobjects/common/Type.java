package io.connectedhealth.idaas.hcdataobjects.common;

import java.util.List;

public class Type {
    public List<Extension> extension;
    public String code;
    public List<String> profile;
    public List<String> targetProfile;
    public List<Coding> coding;

    public List<Extension> getExtension() {
        return extension;
    }

    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getProfile() {
        return profile;
    }

    public void setProfile(List<String> profile) {
        this.profile = profile;
    }

    public List<String> getTargetProfile() {
        return targetProfile;
    }

    public void setTargetProfile(List<String> targetProfile) {
        this.targetProfile = targetProfile;
    }

    public List<Coding> getCoding() {
        return coding;
    }

    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }
}
