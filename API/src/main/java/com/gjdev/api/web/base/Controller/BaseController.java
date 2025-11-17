package com.gjdev.api.web.base.Controller;

import com.gjdev.api.web.ApiResponse;
import com.gjdev.api.web.base.Service.BaseService;
import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class BaseController<E extends BaseEntity> {

    BaseService<E> baseService;
    Class<E> domainClass;

    public BaseController(BaseService<E> baseService, Class<E> domainClass) {
        this.baseService = baseService;
        this.domainClass = domainClass;
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<ApiResponse> getById(@PathVariable Long id) {
       return  ResponseEntity.ok(ApiResponse.success( baseService.getbyId(id)));

    }
}
