package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Change_is_graduate;

public interface Change_is_graduateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Change_is_graduate record);

    int insertSelective(Change_is_graduate record);

    Change_is_graduate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Change_is_graduate record);

    int updateByPrimaryKey(Change_is_graduate record);
}