package com.gjdev.platform.persistance.identitymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import com.gjdev.platform.persistance.secutirymgmt.etdt.Role;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class IdentityRoles extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "IDENTITY", nullable = false)
    protected Identity identity;
    @OneToMany
    @JoinColumn(name = "ROLE", foreignKey = @ForeignKey, insertable = false, updatable = false, nullable = false)
    protected List<Role> role;

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }
}
