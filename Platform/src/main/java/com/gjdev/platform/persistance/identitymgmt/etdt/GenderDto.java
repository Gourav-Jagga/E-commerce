package com.gjdev.platform.persistance.identitymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntityDto;

import java.io.Serializable;

/**
 * DTO for {@link Gender}
 */
public class GenderDto extends BaseEntityDto implements Serializable {
    private static final long serialVersionUID = 2468075640671941632L;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return super.toString() + getClass().getSimpleName() + "(" +
                "gender = " + gender + ")";
    }
}