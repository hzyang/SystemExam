package com.xiaoyang.admin.service;

import com.xiaoyang.admin.exception.UserException;
import com.xiaoyang.admin.model.SysUser;

/**
 * 
 * User接口类.
 * 
 * @author zyhe
 *
 */
public interface UserService {

    /**
     * 新增用户信息.
     * 
     * @param user
     *          user信息
     * @return  返回值
     * 
     * @throws Exception
     *          异常处理
     */
    int insert(SysUser sysUser) throws UserException;
}
