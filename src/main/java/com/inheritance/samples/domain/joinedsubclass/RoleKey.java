package com.inheritance.samples.domain.joinedsubclass;

import java.io.Serializable;

public class RoleKey implements Serializable {
    private String roleId;
    private String partyId;
    private String determinantValue;

    public RoleKey() {
    }

    public RoleKey(String roleId, String partyId, String determinantValue) {
        this.roleId = roleId;
        this.partyId = partyId;
        this.determinantValue = determinantValue;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
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

        RoleKey roleKey = (RoleKey) o;

        if (!determinantValue.equals(roleKey.determinantValue)) return false;
        if (!partyId.equals(roleKey.partyId)) return false;
        if (!roleId.equals(roleKey.roleId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId.hashCode();
        result = 31 * result + partyId.hashCode();
        result = 31 * result + determinantValue.hashCode();
        return result;
    }
}
