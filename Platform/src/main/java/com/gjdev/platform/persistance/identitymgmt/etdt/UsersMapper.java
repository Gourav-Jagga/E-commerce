package com.gjdev.platform.persistance.identitymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsersMapper extends BaseMapper<Gender,GenderDTO> {
    UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);
}