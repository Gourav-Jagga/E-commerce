package com.gjdev.platform.persistance.secutirymgmt.repo;


import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.secutirymgmt.etdt.EntityAuth;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class EntityAuthRepositoryImpl extends BaseRepositoryImpl<EntityAuth, Long> implements EntityAuthRepository {

    public EntityAuthRepositoryImpl(EntityManager entityManager) {
        super(EntityAuth.class, entityManager);
    }
}
