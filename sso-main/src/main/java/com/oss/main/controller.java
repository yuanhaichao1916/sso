package com.oss.main;

import org.springframework.boot.context.event.EventPublishingRunListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author Lenovo
 * @Date 2021/3/18 10:34
 */
@Controller
@RequestMapping("/view")
public class controller {

    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }
}
