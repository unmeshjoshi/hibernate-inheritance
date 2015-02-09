package com.inheritance.samples.domain.joinedsubclass;

import java.io.Serializable;

public class ProfileKey implements Serializable {
    private String id;
    private String profileId;
    private String determinantValue;

    public ProfileKey() {
    }

    public ProfileKey(String id, String profileId, String determinantValue) {
        this.id = id;
        this.profileId = profileId;
        this.determinantValue = determinantValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getDeterminantValue() {
        return determinantValue;
    }

    public void setDeterminantValue(String determinantValue) {
        this.determinantValue = determinantValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfileKey profileKey = (ProfileKey) o;

        if (!determinantValue.equals(profileKey.determinantValue)) return false;
        if (!profileId.equals(profileKey.profileId)) return false;
        if (!id.equals(profileKey.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + profileId.hashCode();
        result = 31 * result + determinantValue.hashCode();
        return result;
    }
}
