package com.gjdev.platform.persistance.configmgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import com.gjdev.platform.persistance.configmgmt.etdt.ConfigGroup;
import jakarta.persistence.EntityManager;

public class ConfigGroupRepositoryImpl extends BaseRepositoryImpl<ConfigGroup, Long> implements ConfigGroupRepository {

    public ConfigGroupRepositoryImpl(EntityManager entityManager) {
        super(ConfigGroup.class, entityManager);
    }
}
