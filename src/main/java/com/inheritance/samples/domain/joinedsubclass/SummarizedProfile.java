package com.inheritance.samples.domain.joinedsubclass;

public class SummarizedProfile extends Profile {
    private String profileSummary;

    public String getProfileSummary() {
        return profileSummary;
    }

    public void setProfileSummary(String profileSummary) {
        this.profileSummary = profileSummary;
    }
}
