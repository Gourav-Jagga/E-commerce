package com.gjdev.platform.persistance.base.etdt;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class NamedEntity extends BaseEntity {

    @Column(name = "NAME", unique = true, nullable = false)
    protected String name;

    @Column(name = "DESCTIPTION")
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