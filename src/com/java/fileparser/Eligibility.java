package com.java.fileparser;

import java.util.Date;

/**
 * Created by raunakshakya on 6/16/15.
 */
public class Eligibility {

    private String id;
    private Date effectiveFrom;
    private Date effectiveTo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getEffectiveFrom() {
        return effectiveFrom;
    }

    public void setEffectiveFrom(Date effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public Date getEffectiveTo() {
        return effectiveTo;
    }

    public void setEffectiveTo(Date effectiveTo) {
        this.effectiveTo = effectiveTo;
    }
}
