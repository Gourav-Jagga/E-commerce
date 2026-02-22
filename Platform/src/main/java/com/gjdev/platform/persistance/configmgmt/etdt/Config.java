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
    @ManyToOne(fetch = FetchType.LAZY) // changed from OneToOne
    @JoinColumn(name = "type_id", nullable = false)
    private ConfigType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private ConfigGroup group;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ConfigType getType() {
        return type;
    }

    public void setType(ConfigType type) {
        this.type = type;
    }

    public ConfigGroup getGroup() {
        return group;
    }

    public void setGroup(ConfigGroup group) {
        this.group = group;
    }
}
