package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Role_rgt_menu_rel;

public interface Role_rgt_menu_relMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role_rgt_menu_rel record);

    int insertSelective(Role_rgt_menu_rel record);

    Role_rgt_menu_rel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role_rgt_menu_rel record);

    int updateByPrimaryKey(Role_rgt_menu_rel record);
}