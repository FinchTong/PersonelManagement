package com.tong.pm.service;

import com.tong.pm.model.Role;

public interface RoleManage {

    void saveRole(Role role);

    Role findRoleById(long id);

    void addUserToRole(Long userId, Long roleId);

    void deleteRole(Role role);
}
