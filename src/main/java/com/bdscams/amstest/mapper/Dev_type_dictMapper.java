package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Dev_type_dict;

public interface Dev_type_dictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dev_type_dict record);

    int insertSelective(Dev_type_dict record);

    Dev_type_dict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dev_type_dict record);

    int updateByPrimaryKey(Dev_type_dict record);
}