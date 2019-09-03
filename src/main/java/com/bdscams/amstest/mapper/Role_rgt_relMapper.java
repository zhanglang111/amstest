package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Role_rgt_rel;

public interface Role_rgt_relMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role_rgt_rel record);

    int insertSelective(Role_rgt_rel record);

    Role_rgt_rel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role_rgt_rel record);

    int updateByPrimaryKey(Role_rgt_rel record);
}