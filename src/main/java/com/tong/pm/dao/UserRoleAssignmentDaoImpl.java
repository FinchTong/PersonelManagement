package com.tong.pm.dao;

import com.tong.pm.exception.PersonManageException;
import com.tong.pm.model.Role;
import com.tong.pm.model.User;
import com.tong.pm.model.UserRoleAssignment;
import com.tong.pm.model.UserRoleAssignmentImpl;
import com.tong.pm.service.RoleManage;
import com.tong.pm.service.UserManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository(value = "userRoleAssignmentDao")
public class UserRoleAssignmentDaoImpl extends BaseDaoImpl implements UserRoleAssignmentDao{

    @Autowired
    UserManage userManage;

    @Autowired
    RoleManage roleManage;

    @Override
    public void addUserToRole(Long userId, Long roleId) {
        User user;
        if(userId != null) {
            user = userManage.findUserById(userId);
        } else {
            throw new PersonManageException("userId is null!");
        }
        Role role;
        if(roleId != null) {
            role = roleManage.findRoleById(roleId);
        } else {
            throw new PersonManageException("roleId is null!");
        }
        UserRoleAssignment userRoleAssignment = new UserRoleAssignmentImpl();
        userRoleAssignment.setUser(user);
        userRoleAssignment.setRole(role);
        super.saveOrUpdate(userRoleAssignment);
    }

    @Override
    public List<UserRoleAssignment> findByUser(long userId) {
        String hql = "from " + UserRoleAssignmentImpl.class + " as u where u.userId = :userId ";
        Map<String, Object> params = new HashMap<>(16);
        params.put("userId", userId);
        return super.find(hql, params);
    }

    @Override
    public List<UserRoleAssignment> findByRole(long roleId) {
        String hql = "from " + UserRoleAssignment.class + " as u where u.roleId = :roleId ";
        Map<String, Object> params = new HashMap<>(16);
        params.put("roleId", roleId);
        return super.find(hql, params);
    }
}
