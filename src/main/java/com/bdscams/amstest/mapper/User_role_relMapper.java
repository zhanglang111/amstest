package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.User_role_rel;

public interface User_role_relMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User_role_rel record);

    int insertSelective(User_role_rel record);

    User_role_rel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User_role_rel record);

    int updateByPrimaryKey(User_role_rel record);
}