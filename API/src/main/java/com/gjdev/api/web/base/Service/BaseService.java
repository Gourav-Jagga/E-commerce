package com.gjdev.api.web.base.Service;

import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseService<E extends BaseEntity> {
    E getbyId(Long Id);
}
