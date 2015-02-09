package com.inheritance.samples.domain.joinedsubclass;

public class CustomizedProfile extends SummarizedProfile {
    private String additionalProfileSummary;

    public String getAdditionalProfileSummary() {
        return additionalProfileSummary;
    }

    public void setAdditionalProfileSummary(String additionalProfileSummary) {
        this.additionalProfileSummary = additionalProfileSummary;
    }
}
