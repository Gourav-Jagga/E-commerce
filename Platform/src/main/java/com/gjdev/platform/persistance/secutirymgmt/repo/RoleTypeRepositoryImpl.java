package com.gjdev.platform.persistance.secutirymgmt.repo;


import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.secutirymgmt.etdt.EntityAuth;
import com.gjdev.platform.persistance.secutirymgmt.etdt.RoleType;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class RoleTypeRepositoryImpl extends BaseRepositoryImpl<RoleType, Long> implements RoleTypeRepository {

    public RoleTypeRepositoryImpl(EntityManager entityManager) {
        super(RoleType.class, entityManager);
    }
}
