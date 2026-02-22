package com.gjdev.platform.persistance.identitymgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.identitymgmt.etdt.IdentityRoles;
import jakarta.persistence.EntityManager;

public class IdentityRolesRepositoryImpl extends BaseRepositoryImpl<IdentityRoles, Long> implements IdentityRolesRepository {

    public IdentityRolesRepositoryImpl(EntityManager entityManager) {
        super(IdentityRoles.class, entityManager);
    }
}
