package com.gjdev.platform.persistance.identitymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GenderMapper extends BaseMapper<Gender,GenderDTO> {
    GenderMapper INSTANCE = Mappers.getMapper(GenderMapper.class);
}