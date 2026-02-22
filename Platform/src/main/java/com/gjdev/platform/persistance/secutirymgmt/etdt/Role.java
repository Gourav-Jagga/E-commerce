package com.gjdev.platform.persistance.secutirymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.NamedEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Role extends NamedEntity {

    @ManyToOne
    @JoinColumn(name = "TYPE", foreignKey = @ForeignKey, updatable = false, insertable = false, referencedColumnName = "NAME", nullable = false)
    protected RoleType type;

    @OneToMany
    @JoinColumn(name = "ENTITY_AUTH" ,foreignKey = @ForeignKey)
    protected List<EntityAuth> entityAuth;

}