package com.gjdev.platform.persistance.identitymgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.identitymgmt.etdt.Gender;
import jakarta.persistence.EntityManager;

public class GenderRepositoryImpl extends BaseRepositoryImpl<Gender, Long> implements GenderRepository {

    public GenderRepositoryImpl(EntityManager entityManager) {
        super(Gender.class, entityManager);
    }
}
