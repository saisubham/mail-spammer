package com.sudosai.maildemo;

import java.util.List;

public class Mail {
    private String sender;
    private List<String> receivers;
    private List<String> ccList;
    private List<String> bccList;
    private String subject;
    private String content;
    private String contentType;
    private List<Object> attachments;

    public Mail() {
        contentType = "text/plain";
    }

    public Mail(String sender, List<String> receivers, List<String> ccList, List<String> bccList, String subject, String content, String contentType, List<Object> attachments) {
        this.sender = sender;
        this.receivers = receivers;
        this.ccList = ccList;
        this.bccList = bccList;
        this.subject = subject;
        this.content = content;
        this.contentType = contentType;
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "sender='" + sender + '\'' +
                ", receivers=" + receivers +
                ", ccList=" + ccList +
                ", bccList=" + bccList +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", contentType='" + contentType + '\'' +
                ", attachments=" + attachments +
                '}';
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public List<String> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<String> receivers) {
        this.receivers = receivers;
    }

    public List<String> getCcList() {
        return ccList;
    }

    public void setCcList(List<String> ccList) {
        this.ccList = ccList;
    }

    public List<String> getBccList() {
        return bccList;
    }

    public void setBccList(List<String> bccList) {
        this.bccList = bccList;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public List<Object> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }
}
