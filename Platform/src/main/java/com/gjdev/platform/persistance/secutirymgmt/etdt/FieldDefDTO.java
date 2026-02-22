package com.gjdev.platform.persistance.secutirymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntityDTO;
import jakarta.persistence.*;

public class FieldDefDTO extends BaseEntityDTO {

    private String fieldName;

    private String columnName;

    private String dataType;

    private EntityDefDTO entityDef;

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

    public EntityDefDTO getEntityDef() {
        return entityDef;
    }

    public void setEntityDef(EntityDefDTO entityDef) {
        this.entityDef = entityDef;
    }
}
