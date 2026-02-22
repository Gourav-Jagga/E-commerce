package com.gjdev.platform.persistance.identitymgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.identitymgmt.etdt.IdentityType;
import jakarta.persistence.EntityManager;

public class IdentityTypeRepositoryImpl extends BaseRepositoryImpl<IdentityType, Long> implements IdentityTypeRepository {

    public IdentityTypeRepositoryImpl(EntityManager entityManager) {
        super(IdentityType.class, entityManager);
    }
}
