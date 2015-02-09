package com.inheritance.samples.domain.joinedsubclass;

public class Profile {
    private ProfileKey profileKey;
    private String fullName;

    public ProfileKey getProfileKey() {
        return profileKey;
    }

    public void setProfileKey(ProfileKey profileKey) {
        this.profileKey = profileKey;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
