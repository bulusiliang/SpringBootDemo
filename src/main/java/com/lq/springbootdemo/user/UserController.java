package com.lq.springbootdemo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 跳转首页
     * @return
     */
    @RequestMapping(value = "toMain")
    public String toMain(){
        return "views/home/menu";
    }

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping(value = "login")
    public String login(){
        return "views/home/login";
    }
}
