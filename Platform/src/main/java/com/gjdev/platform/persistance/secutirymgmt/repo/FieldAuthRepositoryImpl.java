package com.gjdev.platform.persistance.secutirymgmt.repo;


import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.secutirymgmt.etdt.EntityAuth;
import com.gjdev.platform.persistance.secutirymgmt.etdt.FieldAuth;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class FieldAuthRepositoryImpl extends BaseRepositoryImpl<FieldAuth, Long> implements FieldAuthRepository {

    public FieldAuthRepositoryImpl(EntityManager entityManager) {
        super(FieldAuth.class, entityManager);
    }
}