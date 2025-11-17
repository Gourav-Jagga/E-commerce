package com.gjdev.platform.persistance.identitymgmt.etdt;


import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import jakarta.persistence.*;

@Entity
public class Users extends BaseEntity {
    @Column(name = "PASSWORD")
    protected String Password;
    @OneToOne
    @JoinColumn(name = "IDENTITY_ID", foreignKey = @ForeignKey, nullable = false, updatable = false, insertable = true, referencedColumnName = "ID")
    protected Identity identityId;
    protected String username;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Identity getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Identity identityId) {
        this.identityId = identityId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
