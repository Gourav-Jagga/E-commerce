package com.gjdev.platform.persistance.configmgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepository;
import com.gjdev.platform.persistance.configmgmt.etdt.ConfigGroup;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigGroupRepository extends BaseRepository<ConfigGroup,Long> {
}
