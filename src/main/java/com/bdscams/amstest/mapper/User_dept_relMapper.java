package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.User_dept_rel;

public interface User_dept_relMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User_dept_rel record);

    int insertSelective(User_dept_rel record);

    User_dept_rel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User_dept_rel record);

    int updateByPrimaryKey(User_dept_rel record);
}