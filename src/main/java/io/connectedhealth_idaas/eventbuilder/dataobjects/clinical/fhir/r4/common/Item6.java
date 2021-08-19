package io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common;

import java.util.List;

public class Item6 {
    public String linkId;
    public String text;
    public String type;
    public boolean required;
    public boolean repeats;
    public List<Extension> extension;
    public List<Item> item;
    public String answerValueSet;

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isRepeats() {
        return repeats;
    }

    public void setRepeats(boolean repeats) {
        this.repeats = repeats;
    }

    public List<Extension> getExtension() {
        return extension;
    }

    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public String getAnswerValueSet() {
        return answerValueSet;
    }

    public void setAnswerValueSet(String answerValueSet) {
        this.answerValueSet = answerValueSet;
    }
}
