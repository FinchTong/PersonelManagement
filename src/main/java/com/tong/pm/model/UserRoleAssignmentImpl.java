package com.tong.pm.model;

import javax.persistence.*;

@Entity
@Table(name = "pm_UserRoleAssignment")
public class UserRoleAssignmentImpl extends DataObjectImpl implements UserRoleAssignment{

    @ManyToOne(targetEntity = UserImpl.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(targetEntity = RoleImpl.class)
    @JoinColumn(name = "roleId")
    private Role role;

    public UserRoleAssignmentImpl() {
        super();
    }

    public UserRoleAssignmentImpl(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public void setRole(Role role) {
        this.role = role;
    }
}
