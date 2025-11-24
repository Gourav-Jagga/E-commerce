package com.gjdev.platform.persistance.secutirymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "FIELD_DEF")
public class FieldDef extends BaseEntity {

    @Column(name = "FIELD_NAME", nullable = false)
    private String fieldName;

    @Column(name = "COLUMN_NAME", nullable = false)
    private String columnName;

    @Column(name = "DATA_TYPE", nullable = false)
    private String dataType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ENTITY_ID", nullable = false)
    private EntityDef entityDef;

   public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public EntityDef getEntityDef() {
        return entityDef;
    }

    public void setEntityDef(EntityDef entityDef) {
        this.entityDef = entityDef;
    }
}
