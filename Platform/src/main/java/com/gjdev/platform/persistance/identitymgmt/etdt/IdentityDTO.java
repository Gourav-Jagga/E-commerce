package com.gjdev.platform.persistance.identitymgmt.etdt;


import com.gjdev.platform.persistance.base.etdt.BaseEntityDTO;
import com.gjdev.platform.utility.Buildiable;
import jakarta.persistence.*;

import java.util.Date;

public class IdentityDTO extends BaseEntityDTO {

    protected String firstname;

    protected String lastName;

    protected GenderDTO gender;

    protected Date DOB;

    protected IdentityTypeDTO type;

    protected String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GenderDTO getGender() {
        return gender;
    }

    public void setGender(GenderDTO gender) {
        this.gender = gender;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public IdentityTypeDTO getType() {
        return type;
    }

    public void setType(IdentityTypeDTO type) {
        this.type = type;
    }
}
