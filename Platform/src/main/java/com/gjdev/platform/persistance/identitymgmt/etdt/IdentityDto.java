package com.gjdev.platform.persistance.identitymgmt.etdt;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link Identity}
 */
public class IdentityDto implements Serializable {
    private static final long serialVersionUID = 2192650279198624647L;
    private String firstname;
    private String lastName;
    private GenderDto gender;
    private Date DOB;
    private IdentityTypeDto type;
    private String mail;

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

    public GenderDto getGender() {
        return gender;
    }

    public void setGender(GenderDto gender) {
        this.gender = gender;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public IdentityTypeDto getType() {
        return type;
    }

    public void setType(IdentityTypeDto type) {
        this.type = type;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return super.toString() + getClass().getSimpleName() + "(" +
                "firstname = " + firstname + ", " +
                "lastName = " + lastName + ", " +
                "gender = " + gender + ", " +
                "DOB = " + DOB + ", " +
                "type = " + type + ", " +
                "mail = " + mail + ")";
    }
}