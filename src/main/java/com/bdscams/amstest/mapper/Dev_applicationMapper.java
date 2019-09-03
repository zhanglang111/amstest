package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Dev_application;

public interface Dev_applicationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dev_application record);

    int insertSelective(Dev_application record);

    Dev_application selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dev_application record);

    int updateByPrimaryKey(Dev_application record);
}