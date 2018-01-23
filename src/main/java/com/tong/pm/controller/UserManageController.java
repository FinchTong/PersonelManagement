package com.tong.pm.controller;

import com.tong.pm.model.User;
import com.tong.pm.model.UserVo;
import com.tong.pm.service.UserManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author finch
 * @date 2018/1/18
 */
@Controller
public class UserManageController {

    @Autowired
    private UserManage userManage;

    @RequestMapping(value = "/addUserView", method = RequestMethod.GET)
    public String addUserView() {
        return "AddUserView";
    }

    @RequestMapping(value = "/addUserInfo", method = RequestMethod.POST)
    @ResponseBody
    public String addUserInfo(HttpServletRequest request, HttpServletResponse response, UserVo userVo) {
        User user = userManage.userVoToDo(userVo);
        userManage.saveUser(user);
        return "success";
    }

}
