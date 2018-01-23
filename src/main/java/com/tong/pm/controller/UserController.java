package com.tong.pm.controller;

import com.tong.pm.model.Role;
import com.tong.pm.model.User;
import com.tong.pm.service.RoleManage;
import com.tong.pm.service.UserManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author tong
 */
@RestController
public class UserController {

    @Autowired
    UserManage userManage;

    @Autowired
    RoleManage roleManage;

    @RequestMapping(value = "/rest/user/{id}", method = RequestMethod.GET)
    public String getUserInfo(@PathVariable long id) {
        User user = null;
        if (id != 0) {
            user = userManage.findUserById(id);
            user.getUserRoleAssignments();
        }
        return user.toString();
    }

    @RequestMapping(value = "/rest/addUserToRole", method = RequestMethod.GET)
    public String saveUserRoleAssignment(@RequestParam("userId") Long userId, @RequestParam("roleId") Long roleId) {
        roleManage.addUserToRole(userId, roleId);
        return "true";
    }

    @RequestMapping(value = "/rest/deleteRole/{id}", method = RequestMethod.GET)
    public String deleteRoleById(@PathVariable Long id) {
        Role role = roleManage.findRoleById(id);
        roleManage.deleteRole(role);
        return role.toString();
    }

}
