package com.gjdev.platform.persistance.identitymgmt.etdt;


import com.gjdev.platform.persistance.base.etdt.BaseEntityDTO;

public class UsersDTO extends BaseEntityDTO {
    protected String Password;
    protected IdentityDTO identityId;
    protected String username;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public IdentityDTO getIdentityId() {
        return identityId;
    }

    public void setIdentityId(IdentityDTO identityId) {
        this.identityId = identityId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
