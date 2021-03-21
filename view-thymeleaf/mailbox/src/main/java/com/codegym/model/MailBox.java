package com.codegym.model;

public class MailBox {
    private String languages;
    private String pageSize;
    private String spamsFitter;
    private String signature;

    public MailBox() {
    }

    public MailBox(String languages, String pageSize, String spamsFitter, String signature) {
        this.languages = languages;
        this.pageSize = pageSize;
        this.spamsFitter = spamsFitter;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getSpamsFitter() {
        return spamsFitter;
    }

    public void setSpamsFitter(String spamsFitter) {
        this.spamsFitter = spamsFitter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "MailBox{" +
                "languages='" + languages + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", spamsFitter='" + spamsFitter + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
