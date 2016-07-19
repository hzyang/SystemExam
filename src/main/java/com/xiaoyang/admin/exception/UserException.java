package com.xiaoyang.admin.exception;

import com.xiaoyang.base.exceptions.BaseException;

/**
 * 用户统一异常.
 * 
 * @author zyhe
 *
 */
public class UserException extends BaseException{

    private static final long serialVersionUID = 1L;
    
    private static final String EXCEPTION_CODE = "com.xiaoyang.admin.exception";
    /**
     * 用户名不存在.
     */
    private static final String MSG_ERROR_ADMIN_USER_NAME_NOT_EXIST = "msg.error.admin_user_name_not_exist";
    /**
     * 密码错误
     */
    private static final String MSG_ERROR_ADMIN_USER_PASSWORD_ERROR = "msg.error.admin_user_password_error";
    /**
     * 用户名不能为空
     */
    private static final String MSG_ERROR_ADMIN_USER_NAME_NOT_NULL = "msg.error.admin_user_name_not_null";
    /**
     * 密码不为空
     */
    private static final String MSG_ERROR_ADMIN_USER_PASSWORD_NOT_NUL = "msg.error.admin_user_password_not_null";
    /**
     * 用户不可用
     */
    private static final String MSG_ERROR_ADMIN_USER_STATUS_IS_CLOSE = "msg.error.admin_user_status_is_close";
    
    /**
     * 构造方法。
     * 
     * @param descriptionKey
     *              消息代码
     * @param parameters
     *              消息参数
     */
    protected UserException(String descriptionKey, Object[] parameters) {
        super(EXCEPTION_CODE, descriptionKey, parameters);
    }
    
}
