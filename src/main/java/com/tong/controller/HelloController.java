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
        model.addAttribute("title", "Hello World!");
        model.addAttribute("message", "This is welcome page!");
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

    @RequestMapping(value = "/addRole", method = RequestMethod.GET)
    public String addRoleView() {
        return "AddRolePage";
    }
}
