package com.tong.pm.model;

public interface UserRoleAssignment extends DataObject {

    User getUser();

    void setUser(User user);

    Role getRole();

    void setRole(Role role);
}
