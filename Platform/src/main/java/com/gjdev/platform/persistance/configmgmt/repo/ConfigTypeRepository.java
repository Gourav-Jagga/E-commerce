package com.gjdev.platform.persistance.configmgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepository;
import com.gjdev.platform.persistance.configmgmt.etdt.ConfigType;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigTypeRepository extends BaseRepository<ConfigType,Long> {
}
