package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Apply_approve;

public interface Apply_approveMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Apply_approve record);

    int insertSelective(Apply_approve record);

    Apply_approve selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Apply_approve record);

    int updateByPrimaryKey(Apply_approve record);
}