package com.inheritance.samples.domain.joinedsubclass;

public class Role {
    private RoleKey roleKey;
    private String profileSummary;

    public RoleKey getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(RoleKey roleKey) {
        this.roleKey = roleKey;
    }

    public String getProfileSummary() {
        return profileSummary;
    }

    public void setProfileSummary(String profileSummary) {
        this.profileSummary = profileSummary;
    }
}
