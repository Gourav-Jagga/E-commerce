package com.gjdev.platform.persistance.configmgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.configmgmt.etdt.ConfigType;
import jakarta.persistence.EntityManager;

public class ConfigTypeRepositoryImpl extends BaseRepositoryImpl<ConfigType, Long> implements ConfigTypeRepository {

    public ConfigTypeRepositoryImpl(EntityManager entityManager) {
        super(ConfigType.class, entityManager);
    }
}
