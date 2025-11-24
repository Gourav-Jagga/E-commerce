package com.gjdev.platform.persistance.secutirymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import jakarta.persistence.*;

@Entity
public class EntityAuth  extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "FIELD_DEF",  foreignKey = @ForeignKey,updatable = false,insertable = false)
    protected  FieldDef fieldDef;

    @Enumerated(EnumType.STRING)
    protected API_TYPE api_type;

    @OneToOne
    protected FieldAuth fieldAuth;

}
