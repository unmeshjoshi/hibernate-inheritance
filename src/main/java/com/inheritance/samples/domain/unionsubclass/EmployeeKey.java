package com.inheritance.samples.domain.unionsubclass;

import java.io.Serializable;

public class EmployeeKey implements Serializable{
    private String id;
    private String employeeType;

    public EmployeeKey(String id, String employeeType) {
        this.id = id;
        this.employeeType = employeeType;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeKey that = (EmployeeKey) o;

        if (!employeeType.equals(that.employeeType)) return false;
        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + employeeType.hashCode();
        return result;
    }
}
