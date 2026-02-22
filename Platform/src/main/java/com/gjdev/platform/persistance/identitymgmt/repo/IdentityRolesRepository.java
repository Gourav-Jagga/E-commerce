package com.gjdev.platform.persistance.identitymgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepository;
import com.gjdev.platform.persistance.identitymgmt.etdt.IdentityRoles;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentityRolesRepository extends BaseRepository<IdentityRoles,Long> {
}
