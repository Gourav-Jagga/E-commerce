package com.gjdev.platform.persistance.secutirymgmt.repo;


import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.secutirymgmt.etdt.EntityAuth;
import com.gjdev.platform.persistance.secutirymgmt.etdt.FieldDef;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class FieldDefRepositoryImpl extends BaseRepositoryImpl<FieldDef, Long> implements FieldDefRepository {

    public FieldDefRepositoryImpl(EntityManager entityManager) {
        super(FieldDef.class, entityManager);
    }
}
