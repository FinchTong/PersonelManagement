package com.tong.pm.service;

import com.tong.pm.dao.UserDao;
import com.tong.pm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tong
 */
@Service(value = "userManage")
@Transactional
public class UserManageImpl implements UserManage {

    @Autowired
    UserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public User findUserById(long id) {
        return userDao.findByOid(id);
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user);
    }
}
