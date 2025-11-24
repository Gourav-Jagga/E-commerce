package com.gjdev.platform.persistance.secutirymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import com.gjdev.platform.persistance.base.etdt.NamedEntity;
import jakarta.persistence.*;

import javax.naming.Name;

@Entity
public class FieldAuth extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "FIELD_DEF",foreignKey = @ForeignKey)
    protected FieldDef fieldDef;

    @Enumerated(EnumType.STRING)
    protected PERMISSONS permission;

}
