package com.tong.pm.controller;

import com.tong.pm.model.RoleVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author finch
 * @date 2018/1/23
 */
@Controller
public class RoleManageController {

    @RequestMapping(value = "/addRoleView", method = RequestMethod.GET)
    public String addRoleView() {
        return "AddRoleView";
    }

    @RequestMapping(value = "/role", method = RequestMethod.POST)
    @ResponseBody
    public String addRoleInfo(RoleVo roleVo) {
        return null;
    }
}
