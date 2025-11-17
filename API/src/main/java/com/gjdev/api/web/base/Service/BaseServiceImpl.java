package com.gjdev.api.web.base.Service;


import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import com.gjdev.platform.persistance.base.repo.BaseRepository;

public class BaseServiceImpl<E extends BaseEntity> implements BaseService<E> {
    BaseRepository baseRepository;
    public BaseServiceImpl(BaseRepository baseRepository) {
        this.baseRepository = baseRepository;
    }
    @Override
    public E getbyId(Long Id) {
        return (E) baseRepository.findById(Id).orElse(null);
    }
}
