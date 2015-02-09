package com.inheritance.samples.domain.unionsubclass;

public class Facility {
    private String branchCode;
    private FacilityKey key;

    public FacilityKey getKey() {
        return key;
    }

    public void setKey(FacilityKey key) {
        this.key = key;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
}
