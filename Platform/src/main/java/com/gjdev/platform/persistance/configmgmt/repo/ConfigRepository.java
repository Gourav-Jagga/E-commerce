package com.gjdev.platform.persistance.configmgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepository;
import com.gjdev.platform.persistance.configmgmt.etdt.Config;
import org.springframework.stereotype.Repository;
@Repository
public interface ConfigRepository extends BaseRepository<Config,Long> {

}

