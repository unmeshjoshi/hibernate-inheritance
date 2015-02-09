package com.inheritance.samples.domain.unionsubclass;

public class CustomizedCreditFacility extends CreditFacility {
    private String externalSystem;

    public String getExternalSystem() {
        return externalSystem;
    }

    public void setExternalSystem(String externalSystem) {
        this.externalSystem = externalSystem;
    }
}
