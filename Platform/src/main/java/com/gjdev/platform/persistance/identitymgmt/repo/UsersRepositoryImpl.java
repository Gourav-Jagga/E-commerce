package com.gjdev.platform.persistance.identitymgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.identitymgmt.etdt.Users;
import jakarta.persistence.EntityManager;

public class UsersRepositoryImpl extends BaseRepositoryImpl<Users, Long> implements UsersRepository {

    public UsersRepositoryImpl(EntityManager entityManager) {
        super(Users.class, entityManager);
    }
}
