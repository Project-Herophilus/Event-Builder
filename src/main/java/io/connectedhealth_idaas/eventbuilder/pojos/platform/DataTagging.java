package io.connectedhealth_idaas.eventbuilder.pojos.platform;

import io.connectedhealth_idaas.eventbuilder.pojos.platform.MessageHeader;

public class DataTagging {
    MessageHeader msgHeader;
    private String[] dataTags;

    public MessageHeader getMsgHeader() {
        return msgHeader;
    }

    public void setMsgHeader(MessageHeader msgHeader) {
        this.msgHeader = msgHeader;
    }

    public String[] getDataTags() {
        return dataTags;
    }
    public void setDataTags(String[] dataTags) {
        this.dataTags = dataTags;
    }
}
