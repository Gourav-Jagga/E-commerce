package com.gjdev.api.web.idnmgmt.Controller;


import com.gjdev.api.web.idnmgmt.Service.IdentityService;
import com.gjdev.api.web.base.Controller.BaseController;
import com.gjdev.platform.persistance.identitymgmt.etdt.Identity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IdentityController extends BaseController<Identity> {
    IdentityService baseService;
    @Autowired
    IdentityController(IdentityService baseService) {
        super(baseService,Identity.class);
        this.baseService=baseService;
    }
    @GetMapping("/name/")
    Identity findByName(){
        return baseService.findByName();
    }
}
