package com.gjdev.platform.persistance.configmgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.NamedEntityDTO;
import jakarta.persistence.*;

public class ConfigDTO extends NamedEntityDTO {

    String value;
    private ConfigTypeDTO type;

    private ConfigGroupDTO group;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ConfigTypeDTO getType() {
        return type;
    }

    public void setType(ConfigTypeDTO type) {
        this.type = type;
    }

    public ConfigGroupDTO getGroup() {
        return group;
    }

    public void setGroup(ConfigGroupDTO group) {
        this.group = group;
    }
}
