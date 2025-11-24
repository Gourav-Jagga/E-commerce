package com.gjdev.platform.persistance.configmgmt.repo;


import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.configmgmt.etdt.Config;
import jakarta.persistence.EntityManager;

public class ConfigRepositoryImpl extends BaseRepositoryImpl<Config, Long> implements ConfigRepository {

    public ConfigRepositoryImpl(EntityManager entityManager) {
        super(Config.class, entityManager);
    }
}
