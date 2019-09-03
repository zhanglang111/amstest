package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Opt_log_type_dict;

public interface Opt_log_type_dictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Opt_log_type_dict record);

    int insertSelective(Opt_log_type_dict record);

    Opt_log_type_dict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Opt_log_type_dict record);

    int updateByPrimaryKey(Opt_log_type_dict record);
}