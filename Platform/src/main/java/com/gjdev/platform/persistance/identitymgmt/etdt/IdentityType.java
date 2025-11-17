package com.gjdev.platform.persistance.identitymgmt.etdt;


import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "IDENTITY_TYPE")
public class IdentityType extends BaseEntity {
    @Column(name = "IDENTITY_CODE", nullable = false, length = 50, unique = true)
    protected String identityCode;

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }
}