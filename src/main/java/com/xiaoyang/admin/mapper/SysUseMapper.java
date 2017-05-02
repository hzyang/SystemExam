package com.xiaoyang.admin.mapper;

import com.xiaoyang.admin.model.SysUse;

public interface SysUseMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SysUse record);

    int insertSelective(SysUse record);

    SysUse selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SysUse record);

    int updateByPrimaryKey(SysUse record);
}