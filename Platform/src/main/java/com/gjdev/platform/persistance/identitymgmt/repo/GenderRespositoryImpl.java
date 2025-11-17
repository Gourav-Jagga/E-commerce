package com.gjdev.platform.persistance.identitymgmt.repo;


import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.identitymgmt.etdt.Gender;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
@Repository
public class GenderRespositoryImpl extends BaseRepositoryImpl<Gender, Long> implements GenderRepository {

    public GenderRespositoryImpl(EntityManager entityManager) {
        super(Gender.class, entityManager);
    }
}
