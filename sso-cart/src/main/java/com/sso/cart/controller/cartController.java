package com.sso.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author Lenovo
 * @Date 2021/3/18 10:52
 */
@Controller
@RequestMapping("/view")
public class cartController {
    @GetMapping("/cart")
    public String toCart(){
        return "cart";
    }
}
