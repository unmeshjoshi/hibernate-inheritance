package com.inheritance.samples.domain.unionsubclass;

public class CreditFacility extends Facility {
    private String periodicityType;

    public String getPeriodicityType() {
        return periodicityType;
    }

    public void setPeriodicityType(String periodicityType) {
        this.periodicityType = periodicityType;
    }
}
