package com.gjdev.platform.persistance.base.etdt;

public interface BaseMapper<E,D> {
    E dtoToEntity(D dto);
    D dtoToDto(E e);
}
