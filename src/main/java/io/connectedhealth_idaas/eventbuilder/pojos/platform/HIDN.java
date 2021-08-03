package io.connectedhealth_idaas.eventbuilder.pojos.platform;
import io.connectedhealth_idaas.eventbuilder.pojos.platform.MessageHeader;

// Healthcare Integrated Data Network
public class HIDN {
    private String serverId;
    private String serverIP;
    MessageHeader msgHeader;
    private String specialInstructions;
    private String[] dataTags;

    public MessageHeader getMsgHeader() {
        return msgHeader;
    }

    public void setMsgHeader(MessageHeader msgHeader) {
        this.msgHeader = msgHeader;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }

    public String[] getDataTags() {
        return dataTags;
    }
    public void setDataTags(String[] dataTags) {
        this.dataTags = dataTags;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

}
