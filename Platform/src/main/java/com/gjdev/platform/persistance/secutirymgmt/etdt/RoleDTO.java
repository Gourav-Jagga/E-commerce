package com.gjdev.platform.persistance.secutirymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.NamedEntityDTO;
import jakarta.persistence.*;

import java.util.List;

public class RoleDTO extends NamedEntityDTO {

    protected RoleTypeDTO type;

    protected List<EntityAuthDTO> entityAuth;

}
