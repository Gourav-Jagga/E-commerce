package com.gjdev.platform.persistance.identitymgmt.repo;


import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.identitymgmt.etdt.IdentityType;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class IdentityTypeRespositoryImpl extends BaseRepositoryImpl<IdentityType, Long> implements IdentityTypeRepository {

    public IdentityTypeRespositoryImpl(EntityManager entityManager) {
        super(IdentityType.class, entityManager);
    }

}
