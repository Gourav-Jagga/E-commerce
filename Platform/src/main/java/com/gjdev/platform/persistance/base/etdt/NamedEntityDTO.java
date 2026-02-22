package com.gjdev.platform.persistance.base.etdt;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

public class NamedEntityDTO extends BaseEntityDTO {

    protected String name;

    protected String description;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
