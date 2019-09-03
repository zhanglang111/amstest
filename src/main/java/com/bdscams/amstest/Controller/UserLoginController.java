package com.bdscams.amstest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/user"})
public class UserLoginController {
    /**
     * 跳转到用户登录页面
     * @return 登录页面
     */
    @RequestMapping(value = {"/loginHtml"})
    public String loginHtml(){
        return "userLogin";
    }

    /**
     * 跳转到用户注册页面
     * @return 注册页面
     */
    @RequestMapping(value = {"/registerpage"})
    public String registerpage(){
        return "register";
    }
}
