package com.tong.pm.service;

import com.tong.pm.model.User;
import com.tong.pm.model.UserVo;

/**
 * @author tong
 */
public interface UserManage {
    void saveUser(User user);

    User findUserById(long id);

    void deleteUser(User user);

    User userVoToDo(UserVo vo);
}
