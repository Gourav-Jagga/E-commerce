package com.gjdev.platform.persistance.secutirymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ENTITY_DEF")
public class EntityDef extends BaseEntity {

    @Column(name = "ENTITY_NAME", nullable = false, unique = true)
    private String entityName;

    @Column(name = "SERVICE_CLASS")
    private String serviceClass;

    @Column(name = "CONTROLLER_CLASS")
    private String controllerClass;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @OneToMany(
            mappedBy = "entityDef",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<FieldDef> fieldDefs = new ArrayList<>();

    public void addFieldDef(FieldDef fieldDef) {
        fieldDefs.add(fieldDef);
        fieldDef.setEntityDef(this);
    }

    public void removeFieldDef(FieldDef fieldDef) {
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

    public List<FieldDef> getFieldDefs() {
        return fieldDefs;
    }

    public void setFieldDefs(List<FieldDef> fieldDefs) {
        this.fieldDefs = fieldDefs;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
