package com.gjdev.platform.persistance.secutirymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntityDTO;
import jakarta.persistence.*;

public class FieldAuthDTO extends BaseEntityDTO {
    protected FieldDefDTO fieldDef;

    protected PERMISSONS permission;

}
