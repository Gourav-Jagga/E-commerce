package com.gjdev.platform.persistance.secutirymgmt.repo;


import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.secutirymgmt.etdt.EntityDef;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class EntityDefRepositoryImpl extends BaseRepositoryImpl<EntityDef, Long> implements EntityDefRepository {

    public EntityDefRepositoryImpl(EntityManager entityManager) {
        super(EntityDef.class, entityManager);
    }
}
