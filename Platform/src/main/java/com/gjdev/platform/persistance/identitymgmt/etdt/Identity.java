package com.gjdev.platform.persistance.identitymgmt.etdt;


import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import com.gjdev.platform.utility.Buildiable;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Buildiable
public class Identity extends BaseEntity {
    @Column(name = "FIRST_NAME", nullable = false, length = 50)
    protected String firstname;

    @Column(name = "LAST_NAME", nullable = false, length = 50)
    protected String lastName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "GENDER", foreignKey = @ForeignKey, updatable = false, insertable = false, referencedColumnName = "GENDER", nullable = false)
    protected Gender gender;

    @Column(name = "DATE_OF_BIRTH", nullable = false)
    protected Date DOB;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TYPE", foreignKey = @ForeignKey, updatable = false, insertable = false, referencedColumnName = "IDENTITY_CODE", nullable = false)
    protected IdentityType type;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public IdentityType getType() {
        return type;
    }

    public void setType(IdentityType type) {
        this.type = type;
    }
}
