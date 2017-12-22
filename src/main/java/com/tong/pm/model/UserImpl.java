package com.tong.pm.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author finch
 */
@Entity
@Table(name = "PM_USER")
public class UserImpl extends DataObjectImpl implements User {

    @Column(length = 128)
    private String userName;

    @Column(length = 128)
    private String password;

    @Column(length = 128)
    private String email;

    @Column(length = 256)
    private String address;

    @OneToMany(targetEntity = UserRoleAssignmentImpl.class, cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "userId")
    private Set<UserRoleAssignment> userRoleAssignments = new HashSet<>();

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Set<UserRoleAssignment> getUserRoleAssignments() {
        return userRoleAssignments;
    }

    @Override
    public void setUserRoleAssignments(Set<UserRoleAssignment> userRoleAssignments) {
        this.userRoleAssignments = userRoleAssignments;
    }

    @Override
    public String toString() {
        return "UserImpl{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
