package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Dev_type_detai;

public interface Dev_type_detaiMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dev_type_detai record);

    int insertSelective(Dev_type_detai record);

    Dev_type_detai selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dev_type_detai record);

    int updateByPrimaryKey(Dev_type_detai record);
}