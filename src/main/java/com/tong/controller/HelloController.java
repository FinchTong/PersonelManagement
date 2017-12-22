package com.tong.controller;

import com.tong.pm.model.*;
import com.tong.pm.service.RoleManage;
import com.tong.pm.service.UserManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @Autowired
    UserManage userManage;

    @Autowired
    RoleManage roleManage;

    @RequestMapping(value = {"/welcome**"}, method = RequestMethod.GET)
    public String welcomePage(ModelMap model) {
        /*ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is welcome page!");
        model.setViewName("hello");*/
        model.addAttribute("title", "Hello World!");
        model.addAttribute("message", "This is welcome page!");
        /*User user = new UserImpl();
        user.setUserName("tong");
        user.setPassword("123456");
        userManage.saveUser(user);*/
        Role role = new RoleImpl();
        role.setDescription("管理员");
        role.setExternalReference("admin");
        role.setName("管理员");
        roleManage.saveRole(role);
        return "hello";
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Secutiry Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");
        return model;
    }
}
