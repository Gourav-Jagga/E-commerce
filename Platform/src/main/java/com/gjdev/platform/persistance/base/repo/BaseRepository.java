package com.gjdev.platform.persistance.base.repo;

import com.gjdev.platform.utility.CriteriaImpl.SearchCriteria;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;
@NoRepositoryBean
public interface BaseRepository<T,ID>  {
    Optional<T> findById(ID id);
    Optional<T> findByCriteria(SearchCriteria searchCriteria);
    long count() ;
    public <S extends T> List<S> saveAll(Iterable<S> entities) ;
    public List<T> findAll();
}

