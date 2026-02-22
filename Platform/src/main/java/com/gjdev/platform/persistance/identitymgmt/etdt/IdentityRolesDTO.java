package com.gjdev.platform.persistance.identitymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntityDTO;
import com.gjdev.platform.persistance.secutirymgmt.etdt.RoleDTO;
import jakarta.persistence.*;

import java.util.List;

public class IdentityRolesDTO extends BaseEntityDTO {
    protected IdentityDTO identity;
    protected List<RoleDTO> role;

    public IdentityDTO getIdentity() {
        return identity;
    }

    public void setIdentity(IdentityDTO identity) {
        this.identity = identity;
    }

    public List<RoleDTO> getRole() {
        return role;
    }

    public void setRole(List<RoleDTO> role) {
        this.role = role;
    }
}
