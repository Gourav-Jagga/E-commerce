package com.gjdev.platform.persistance.identitymgmt.repo;


import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.identitymgmt.etdt.Identity;
import com.gjdev.platform.utility.Builder;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
@Repository
public class IdentityRepositoryImpl extends BaseRepositoryImpl<Identity, Long> implements IdentityRepository{

    public IdentityRepositoryImpl( EntityManager entityManager) {
        super(Identity.class, entityManager);
    }
    public Identity findByName(){
        return Builder.of(Identity.class).with((I, V)->I.setFirstname(V),"Test1").build();
    }

}
