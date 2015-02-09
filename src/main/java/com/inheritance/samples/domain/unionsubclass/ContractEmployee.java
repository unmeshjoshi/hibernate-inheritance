package com.inheritance.samples.domain.unionsubclass;

public class ContractEmployee extends Employee {
    private String contractTerm;

    public String getContractTerm() {
        return contractTerm;
    }

    public void setContractTerm(String contractTerm) {
        this.contractTerm = contractTerm;
    }
}
