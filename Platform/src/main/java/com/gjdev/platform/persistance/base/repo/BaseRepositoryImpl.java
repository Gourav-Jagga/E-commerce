package com.gjdev.platform.persistance.base.repo;


import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import com.gjdev.platform.utility.CriteriaImpl.SearchCriteria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;
@NoRepositoryBean
public class BaseRepositoryImpl<T extends BaseEntity, ID> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID>, JpaRepository<T, ID> {
    protected final EntityManager em;

    Class<T> domainClass;

    public BaseRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.domainClass = domainClass;
        this.em = em;
    }



    @Override
    public Optional<T> findByCriteria(SearchCriteria searchCriteria) {
        CriteriaBuilder cb= em.getCriteriaBuilder();
        cb.createQuery();


        return Optional.empty();
    }
}
