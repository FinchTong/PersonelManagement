package com.tong.pm.dao;

import com.tong.pm.model.Role;
import com.tong.pm.model.User;
import com.tong.pm.model.UserRoleAssignment;

import java.util.List;

public interface UserRoleAssignmentDao {

    void addUserToRole(Long userId, Long roleId);

    List<UserRoleAssignment> findByUser(long userId);

    List<UserRoleAssignment> findByRole(long roleId);
}
