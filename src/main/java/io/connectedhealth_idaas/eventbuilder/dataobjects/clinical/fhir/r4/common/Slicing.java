package io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common;

import java.util.List;

public class Slicing {
    public List<Discriminator> discriminator;
    public boolean ordered;
    public String rules;

    public List<Discriminator> getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(List<Discriminator> discriminator) {
        this.discriminator = discriminator;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }
}
