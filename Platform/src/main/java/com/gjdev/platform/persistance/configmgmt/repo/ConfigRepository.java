package com.gjdev.platform.persistance.configmgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepository;
import com.gjdev.platform.persistance.configmgmt.etdt.Config;
import com.gjdev.platform.utility.CriteriaImpl.SearchCriteria;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ConfigRepository extends BaseRepository<Config,Long> {

}

