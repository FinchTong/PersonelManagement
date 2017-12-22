package com.tong.pm.dao;

import com.tong.pm.model.User;

public interface UserDao {
    void save(User user);

    User findByOid(long oid);

    void delete(User user);
}
