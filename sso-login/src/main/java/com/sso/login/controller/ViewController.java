package com.sso.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author Lenovo
 * @Date 2021/3/17 18:34
 */
@Controller
@RequestMapping("/view")
public class ViewController {
    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }
}
