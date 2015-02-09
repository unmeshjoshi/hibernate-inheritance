package com.inheritance.samples.domain;

import java.io.Serializable;

public class BureauRecordKey implements Serializable {
    String  bureauServiceCode;
    String  bureauProductId;
    String partyId;

    public BureauRecordKey() {
    }

    public BureauRecordKey(String bureauServiceCode, String bureauProductId, String partyId) {
        this.bureauServiceCode = bureauServiceCode;
        this.bureauProductId = bureauProductId;
        this.partyId = partyId;
    }

    public String getBureauServiceCode() {
        return bureauServiceCode;
    }

    public void setBureauServiceCode(String bureauServiceCode) {
        this.bureauServiceCode = bureauServiceCode;
    }

    public String getBureauProductId() {
        return bureauProductId;
    }

    public void setBureauProductId(String bureauProductId) {
        this.bureauProductId = bureauProductId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BureauRecordKey that = (BureauRecordKey) o;

        if (bureauProductId != null ? !bureauProductId.equals(that.bureauProductId) : that.bureauProductId != null)
            return false;
        if (bureauServiceCode != null ? !bureauServiceCode.equals(that.bureauServiceCode) : that.bureauServiceCode != null)
            return false;
        if (partyId != null ? !partyId.equals(that.partyId) : that.partyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bureauServiceCode != null ? bureauServiceCode.hashCode() : 0;
        result = 31 * result + (bureauProductId != null ? bureauProductId.hashCode() : 0);
        result = 31 * result + (partyId != null ? partyId.hashCode() : 0);
        return result;
    }
}
