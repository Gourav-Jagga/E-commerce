package com.gjdev.platform.persistance.configmgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONFIG")
public class Config extends BaseEntity {
    @Column(name = "NAME",length = 50,nullable = false)
    String name;
    @Column(name = "VALUE",nullable = false)
    String value;
    @Column(name = "DESCRIPTION",nullable = false)
    String Description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
