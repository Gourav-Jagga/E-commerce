package com.gjdev.platform.persistance.configmgmt.etdt;

import java.io.Serializable;

/**
 * DTO for {@link Config}
 */
public class ConfigDto implements Serializable {
    private static final long serialVersionUID = -5484222133434326451L;
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "value = " + value + ")";
    }
}