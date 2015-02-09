package com.inheritance.samples.domain;

public class BureauRecord {
    BureauRecordKey key;
    Integer version;
    String firstName;
    String lastName;

    public BureauRecordKey getKey() {
        return key;
    }

    public void setKey(BureauRecordKey key) {
        this.key = key;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
