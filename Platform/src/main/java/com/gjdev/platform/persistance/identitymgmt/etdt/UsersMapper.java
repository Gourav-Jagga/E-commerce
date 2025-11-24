package com.gjdev.platform.persistance.identitymgmt.etdt;

import com.gjdev.platform.persistance.base.etdt.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsersMapper extends BaseMapper<Gender,GenderDto> {
    UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);
}