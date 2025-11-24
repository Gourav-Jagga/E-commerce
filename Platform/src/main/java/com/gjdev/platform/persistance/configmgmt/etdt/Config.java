package com.gjdev.platform.persistance.configmgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import com.gjdev.platform.persistance.base.etdt.NamedEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONFIG")
public class Config extends NamedEntity {

    @Column(name = "VALUE",nullable = false)
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
