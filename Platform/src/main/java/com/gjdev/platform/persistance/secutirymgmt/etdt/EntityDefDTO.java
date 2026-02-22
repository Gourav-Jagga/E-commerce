package com.gjdev.platform.persistance.secutirymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntityDTO;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class EntityDefDTO extends BaseEntityDTO {

    private String entityName;

    private String serviceClass;

    private String controllerClass;

    private String tableName;
    @OneToMany(
            mappedBy = "entityDef",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<FieldDefDTO> fieldDefs = new ArrayList<>();

    public void addFieldDef(FieldDefDTO fieldDef) {
        fieldDefs.add(fieldDef);
        fieldDef.setEntityDef(this);
    }

    public void removeFieldDef(FieldDefDTO fieldDef) {
        fieldDefs.remove(fieldDef);
        fieldDef.setEntityDef(null);
    }

    // Getters and Setters
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getServiceClass() {
        return serviceClass;
    }

    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    public String getControllerClass() {
        return controllerClass;
    }

    public void setControllerClass(String controllerClass) {
        this.controllerClass = controllerClass;
    }

    public List<FieldDefDTO> getFieldDefs() {
        return fieldDefs;
    }

    public void setFieldDefs(List<FieldDefDTO> fieldDefs) {
        this.fieldDefs = fieldDefs;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
