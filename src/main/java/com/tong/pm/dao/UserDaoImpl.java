package com.tong.pm.dao;

import com.tong.pm.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "userDao")
public class UserDaoImpl extends BaseDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        super.saveOrUpdate(user);
    }

    @Override
    public User findByOid(long oid) {
        return super.find(oid, User.class);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }
}
