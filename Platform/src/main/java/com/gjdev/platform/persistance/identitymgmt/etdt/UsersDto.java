package com.gjdev.platform.persistance.identitymgmt.etdt;

import java.io.Serializable;

/**
 * DTO for {@link Users}
 */
public class UsersDto implements Serializable {
    private static final long serialVersionUID = 2689203776581770738L;
    private String Password;
    private IdentityDto identityId;
    private String username;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public IdentityDto getIdentityId() {
        return identityId;
    }

    public void setIdentityId(IdentityDto identityId) {
        this.identityId = identityId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "Password = " + Password + ", " +
                "identityId = " + identityId + ", " +
                "username = " + username + ")";
    }
}