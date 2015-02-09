package com.inheritance.samples.domain.unionsubclass;

public class CustomizedContractEmployee extends ContractEmployee {
    private String additionalTerms;

    public String getAdditionalTerms() {
        return additionalTerms;
    }

    public void setAdditionalTerms(String additionalTerms) {
        this.additionalTerms = additionalTerms;
    }
}
