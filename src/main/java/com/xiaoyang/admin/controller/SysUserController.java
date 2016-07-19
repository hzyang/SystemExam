package com.xiaoyang.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaoyang.admin.exception.UserException;
import com.xiaoyang.admin.model.SysUser;
import com.xiaoyang.admin.service.UserService;
import com.xiaoyang.base.controllers.BaseController;

/**
 * 用户信息Controller.
 * 
 * @author zyhe
 *
 */
/*@Controller
@RequestMapping*/
public class SysUserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 新增用户信息.
     * 
     * @param request
     *            请求上下文
     * @param sysUser
     *            用户数据
     * @return 返回值
     * @throws UserException
     *             用户统一异常
     */
  /*  @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    @ResponseBody
    public String insert(HttpServletRequest request, @RequestBody SysUser sysUser, Model model) throws UserException {
        int flag = userService.insert(sysUser);
        if (flag == 1) {
            model.addAttribute(flag);
            return "success";
        } else {
            return "error";
        }

    }*/

}
