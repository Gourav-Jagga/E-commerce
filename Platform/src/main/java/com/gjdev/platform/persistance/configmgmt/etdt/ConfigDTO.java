package com.gjdev.platform.persistance.configmgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import com.gjdev.platform.persistance.base.etdt.BaseEntityDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


public class ConfigDTO extends BaseEntityDto {
    String name;
    String value;
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

    @Override
    public String toString() {
        return "ConfigDTO{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
