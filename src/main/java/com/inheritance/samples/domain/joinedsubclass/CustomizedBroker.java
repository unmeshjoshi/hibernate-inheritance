package com.inheritance.samples.domain.joinedsubclass;

public class CustomizedBroker extends Role {
    private String additionalProfileSummary;

    public String getAdditionalProfileSummary() {
        return additionalProfileSummary;
    }

    public void setAdditionalProfileSummary(String additionalProfileSummary) {
        this.additionalProfileSummary = additionalProfileSummary;
    }
}
