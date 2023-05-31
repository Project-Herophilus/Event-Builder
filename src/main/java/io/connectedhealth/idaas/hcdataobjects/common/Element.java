package io.connectedhealth.idaas.hcdataobjects.common;

import java.util.List;

public class Element {

    //public String Id;
    //public String path1;
    //public String short;
    public String definition;
    public String comment;
    public List<String> alias;
    public int min;
    public String max;
    public Base base;
    public List<Constraint> constraint;
    public boolean isModifier;
    public boolean isSummary;
    public List<Mapping> mapping;
    public List<Type> type;
    public String isModifierReason;
    public Binding binding;
    public Slicing slicing;
    public String sliceName;
    public List<String> condition;
    public String requirements;
    public List<Extension> extension;
    public List<String> representation;

    /*
       public String getId() {
           return id;
       }

       public void setId(String id) {
           this.i id;
       }

       /*public String getPath() {
           return path1;
       }

       public void setPath1(String path1) {
           this.path1 = path1;
       }
   */
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<String> getAlias() {
        return alias;
    }

    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public List<Constraint> getConstraint() {
        return constraint;
    }

    public void setConstraint(List<Constraint> constraint) {
        this.constraint = constraint;
    }

    public boolean isModifier() {
        return isModifier;
    }

    public void setModifier(boolean modifier) {
        isModifier = modifier;
    }

    public boolean isSummary() {
        return isSummary;
    }

    public void setSummary(boolean summary) {
        isSummary = summary;
    }

    public List<Mapping> getMapping() {
        return mapping;
    }

    public void setMapping(List<Mapping> mapping) {
        this.mapping = mapping;
    }

    public List<Type> getType() {
        return type;
    }

    public void setType(List<Type> type) {
        this.type = type;
    }

    public String getIsModifierReason() {
        return isModifierReason;
    }

    public void setIsModifierReason(String isModifierReason) {
        this.isModifierReason = isModifierReason;
    }

    public Binding getBinding() {
        return binding;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    public Slicing getSlicing() {
        return slicing;
    }

    public void setSlicing(Slicing slicing) {
        this.slicing = slicing;
    }

    public String getSliceName() {
        return sliceName;
    }

    public void setSliceName(String sliceName) {
        this.sliceName = sliceName;
    }

    public List<String> getCondition() {
        return condition;
    }

    public void setCondition(List<String> condition) {
        this.condition = condition;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public List<Extension> getExtension() {
        return extension;
    }

    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }

    public List<String> getRepresentation() {
        return representation;
    }

    public void setRepresentation(List<String> representation) {
        this.representation = representation;
    }
}
