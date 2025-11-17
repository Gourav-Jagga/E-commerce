package com.gjdev.platform.persistance.identitymgmt.repo;


import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.identitymgmt.etdt.Users;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class UserRespositoryImpl extends BaseRepositoryImpl<Users, Long> implements UserRepository {

    public UserRespositoryImpl(EntityManager entityManager) {
        super(Users.class, entityManager);
    }

}
