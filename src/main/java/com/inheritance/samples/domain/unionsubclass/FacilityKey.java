package com.inheritance.samples.domain.unionsubclass;

import java.io.Serializable;

public class FacilityKey implements Serializable{
    private String id;
    private String facilityType;

    public FacilityKey(String id, String facilityType) {
        this.id = id;
        this.facilityType = facilityType;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
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

        FacilityKey that = (FacilityKey) o;

        if (!facilityType.equals(that.facilityType)) return false;
        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + facilityType.hashCode();
        return result;
    }
}
