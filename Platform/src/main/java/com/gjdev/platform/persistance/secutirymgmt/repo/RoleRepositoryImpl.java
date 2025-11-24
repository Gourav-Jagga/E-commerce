package com.gjdev.platform.persistance.secutirymgmt.repo;


import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.secutirymgmt.etdt.EntityAuth;
import com.gjdev.platform.persistance.secutirymgmt.etdt.Role;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class RoleRepositoryImpl extends BaseRepositoryImpl<Role, Long> implements RoleRepository {

    public RoleRepositoryImpl(EntityManager entityManager) {
        super(Role.class, entityManager);
    }
}
