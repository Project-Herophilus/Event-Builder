package io.connectedhealth_idaas.eventbuilder.dataobjects.clinical.fhir.r4.common;

public class Component {

    public Code code;
    public ValueCodeableConcept valueCodeableConcept;

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public ValueCodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    public void setValueCodeableConcept(ValueCodeableConcept valueCodeableConcept) {
        this.valueCodeableConcept = valueCodeableConcept;
    }
}
