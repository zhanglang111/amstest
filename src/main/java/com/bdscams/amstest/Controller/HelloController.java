package com.bdscams.amstest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = {"/hello"})
public class HelloController {

    @RequestMapping(value = {"/springboot"})
    public String hello(HttpServletRequest request){
        request.setAttribute("name","zhanglang");
        return "HelloWord";
    }

}