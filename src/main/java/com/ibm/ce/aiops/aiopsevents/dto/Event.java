package com.ibm.ce.aiops.aiopsevents.dto;

public class Event {

    private Sender sender;
    private Resource resource;
    private Type type;
    private int severity;
    private String summary;
    private String occurrenceTime;
    private int expirySeconds;
    
    public Sender getSender() {
        return sender;
    }
    public void setSender(Sender sender) {
        this.sender = sender;
    }
    public Resource getResource() {
        return resource;
    }
    public void setResource(Resource resource) {
        this.resource = resource;
    }
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public int getSeverity() {
        return severity;
    }
    public void setSeverity(int severity) {
        this.severity = severity;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getOccurrenceTime() {
        return occurrenceTime;
    }
    public void setOccurrenceTime(String occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
    }
    public int getExpirySeconds() {
        return expirySeconds;
    }
    public void setExpirySeconds(int expirySeconds) {
        this.expirySeconds = expirySeconds;
    }

    



    

}
