package com.gjdev.platform.persistance.base.etdt;

import java.io.Serializable;

/**
 * DTO for {@link NamedEntity}
 */
public class NamedEntityDto extends BaseEntityDto implements Serializable {
    private static final long serialVersionUID = -5434239855638867623L;
    private String name;
    private String description;

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

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "description = " + description + ")";
    }
}