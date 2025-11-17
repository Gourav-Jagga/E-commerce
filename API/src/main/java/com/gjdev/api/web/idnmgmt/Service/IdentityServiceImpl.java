package com.gjdev.api.web.idnmgmt.Service;


import com.gjdev.api.web.base.Service.BaseServiceImpl;
import com.gjdev.platform.persistance.identitymgmt.etdt.Identity;
import com.gjdev.platform.persistance.identitymgmt.repo.IdentityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentityServiceImpl extends BaseServiceImpl<Identity> implements IdentityService {
    IdentityRepository repository;
    @Autowired
    IdentityServiceImpl(IdentityRepository repository) {
        super(repository);
        this.repository = repository;
    }
    public Identity findByName(){
        return repository.findByName();
    }

}
