package com.tong.pm.dao;

import com.tong.pm.model.Role;
import org.springframework.stereotype.Repository;

/**
 * @author tong
 */
@Repository(value = "roleDao")
public class RoleDaoImpl extends BaseDaoImpl implements RoleDao {
    @Override
    public void save(Role role) {
        super.saveOrUpdate(role);
    }

    @Override
    public Role findByOid(long oid) {
        return super.find(oid, Role.class);
    }

    @Override
    public void delete(Role role) {
        super.delete(role);
    }
}
