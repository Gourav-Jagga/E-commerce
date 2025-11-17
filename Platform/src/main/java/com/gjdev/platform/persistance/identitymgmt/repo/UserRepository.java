package com.gjdev.platform.persistance.identitymgmt.repo;


import com.gjdev.platform.persistance.base.repo.BaseRepository;
import com.gjdev.platform.persistance.identitymgmt.etdt.Users;
import org.springframework.stereotype.Repository;

public interface UserRepository extends BaseRepository<Users, Long> {

}
