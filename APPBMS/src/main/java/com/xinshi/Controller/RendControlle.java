package com.xinshi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RendControlle {

    @RequestMapping("/login.aa")
    public String LoginHtml(){
        return "login";
    }

    @RequestMapping("/showfrom")
   public String ShowForm(){
        return "form";
    }

    @RequestMapping("/queryFend")
    public String queryFend(){
        return"QueryFend";
    }
}
