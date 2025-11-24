package com.gjdev.platform.persistance.base.etdt;

public interface NamedEntityMapper<E,D> {
    E dtoToEntity(D dto);
    D dtoToDto(E e);
}
