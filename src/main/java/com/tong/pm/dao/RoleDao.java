package com.tong.pm.dao;

import com.tong.pm.model.Role;

public interface RoleDao extends BaseDao{
    void save(Role role);

    Role findByOid(long oid);

    void delete(Role role);
}
