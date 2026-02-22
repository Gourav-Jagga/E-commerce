package com.gjdev.platform.persistance.identitymgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepository;
import com.gjdev.platform.persistance.identitymgmt.etdt.Identity;

public interface IdentityRepository extends BaseRepository<Identity, Long> {
    Identity findByName();
}
