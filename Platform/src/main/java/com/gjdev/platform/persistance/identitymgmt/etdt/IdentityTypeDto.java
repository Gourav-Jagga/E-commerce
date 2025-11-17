package com.gjdev.platform.persistance.identitymgmt.etdt;

import java.io.Serializable;

/**
 * DTO for {@link IdentityType}
 */
public class IdentityTypeDto implements Serializable {
    private static final long serialVersionUID = 2984929647519838058L;
    private String identityCode;

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    @Override
    public String toString() {
        return super.toString() + getClass().getSimpleName() + "(" +
                "identityCode = " + identityCode + ")";
    }
}