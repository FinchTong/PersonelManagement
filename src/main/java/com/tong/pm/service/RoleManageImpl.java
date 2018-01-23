package com.tong.pm.service;

import com.tong.pm.dao.RoleDao;
import com.tong.pm.dao.UserRoleAssignmentDao;
import com.tong.pm.model.Role;
import com.tong.pm.model.RoleImpl;
import com.tong.pm.model.RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "roleManage")
@Transactional(rollbackFor = RuntimeException.class)
public class RoleManageImpl implements RoleManage{

    @Autowired
    RoleDao roleDao;

    @Autowired
    UserRoleAssignmentDao userRoleAssignmentDao;

    @Override
    public void saveRole(Role role) {
        roleDao.save(role);
    }

    @Override
    public Role findRoleById(long id) {
        return roleDao.findByOid(id);
    }

    @Override
    public void addUserToRole(Long userId, Long roleId) {
        userRoleAssignmentDao.addUserToRole(userId, roleId);
    }

    @Override
    public void deleteRole(Role role) {
        roleDao.delete(role);
    }

    @Override
    public Role roleVoToDo(RoleVo roleVo) {
        Role role = new RoleImpl();
        role.setExternalReference(roleVo.getExternalReference());
        role.setName(roleVo.getName());
        role.setDescription(roleVo.getDescription());
        return role;
    }


}
