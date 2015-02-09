package com.inheritance.samples.domain.unionsubclass;

public class Employee {
    private String name;
    private EmployeeKey key;

    public EmployeeKey getKey() {
        return key;
    }

    public void setKey(EmployeeKey key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
