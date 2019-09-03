package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Apply_change_devUser;

public interface Apply_change_devUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Apply_change_devUser record);

    int insertSelective(Apply_change_devUser record);

    Apply_change_devUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Apply_change_devUser record);

    int updateByPrimaryKey(Apply_change_devUser record);
}