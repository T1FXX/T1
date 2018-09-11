package com.xinshi.Controller;

import com.xinshi.entity.dev_user;
import com.xinshi.service.DevUserService;
import com.xinshi.service.impl.DevUserServiceimpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@ResponseBody
public class DevUserController {
    @Resource
    private DevUserService service;

    @RequestMapping("loginYan")
    public String LoginTo(dev_user user, HttpSession session){
        dev_user dev_user = service.QueryUserByLogin(user);
        session.setAttribute("dev_user",dev_user);
        String str="";
        if(dev_user!=null){
            str="{\"delResult\":\"true\"}";
        }else{
            str="{\"delResult\":\"false\"}";
        }
        return str;
    }

}
