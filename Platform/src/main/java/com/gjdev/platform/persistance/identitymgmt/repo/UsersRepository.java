package com.gjdev.platform.persistance.identitymgmt.repo;

import com.gjdev.platform.persistance.base.repo.BaseRepository;
import com.gjdev.platform.persistance.identitymgmt.etdt.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends BaseRepository<Users,Long> {
}
