package com.gjdev.platform.persistance.identitymgmt.etdt;


import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import com.gjdev.platform.utility.Buildiable;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@Buildiable
@Cacheable
public class Gender extends BaseEntity {
    @Column(name = "GENDER", unique = true, nullable = false, length = 20)
    protected String gender;
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
