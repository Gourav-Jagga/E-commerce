package com.gjdev.api.web.idnmgmt.Service;


import com.gjdev.api.web.base.Service.BaseService;
import com.gjdev.platform.persistance.identitymgmt.etdt.Identity;

public interface  IdentityService extends BaseService<Identity> {
    Identity findByName();
}
