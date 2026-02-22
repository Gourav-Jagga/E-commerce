package com.gjdev.platform.persistance.configmgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class ConfigType<T> extends BaseEntity {

    private  String name;
    private  Class<T> targetClass;

    public String getName() {
        return name;
    }

    public Class<T> getTargetClass() {
        return targetClass;
    }
}
