package com.gjdev.platform.persistance.secutirymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseEntityDTO;
import jakarta.persistence.*;

public class EntityAuthDTO  extends BaseEntityDTO {
    protected  FieldDefDTO fieldDef;

    protected API_TYPE api_type;

    protected FieldAuthDTO fieldAuth;

}
