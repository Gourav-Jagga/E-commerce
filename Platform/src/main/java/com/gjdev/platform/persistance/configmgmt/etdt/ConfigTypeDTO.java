package com.gjdev.platform.persistance.configmgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntityDTO;

public class ConfigTypeDTO<T> extends BaseEntityDTO {

    private  String name;
    private  Class<T> targetClass;

    public String getName() {
        return name;
    }

    public Class<T> getTargetClass() {
        return targetClass;
    }
}
