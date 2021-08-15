package io.connectedhealth_idaas.eventbuilder.dataobjects.platform;

import io.connectedhealth_idaas.eventbuilder.dataobjects.general.Codeset;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TerminologyCrossMap {

    private MessageHeader msgHeader;
    private Codeset inputCode;
    private Codeset outputCodes[];

    public MessageHeader getMsgHeader() {
        return msgHeader;
    }

    public void setMsgHeader(MessageHeader msgHeader) {
        this.msgHeader = msgHeader;
    }

    public Codeset getInputCode() {
        return inputCode;
    }

    public void setInputCode(Codeset inputCode) {
        this.inputCode = inputCode;
    }

    public Codeset[] getOutputCodes() {
        return outputCodes;
    }

    public void setOutputCodes(Codeset[] outputCodes) {
        this.outputCodes = outputCodes;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
