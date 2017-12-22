package com.tong.pm.model;

import java.util.Set;

/**
 * User class
 *
 * @author tong
 * @date 2017/12/22
 */
public interface User extends DataObject{

    /**
     *  get User Name
     * @return userName
     */
    String getUserName();

    /**
     *  set User Name
     * @param userName
     */
    void setUserName(String userName);

    /**
     *  get password
     * @return password
     */
    String getPassword();

    /**
     *  set password
     * @param password
     */
    void setPassword(String password);

    /**
     * get email
     * @return email
     */
    String getEmail();

    /**
     * set email
     * @param email
     */
    void setEmail(String email);

    /**
     * get address
     * @return address
     */
    String getAddress();

    /**
     * set address
     * @param address
     */
    void setAddress(String address);

    /**
     * get userRoleAssignment
     * @return userRoleAssignment
     */
    Set<UserRoleAssignment> getUserRoleAssignments();

    /**
     * set userRoleAssignment
     * @param userRoleAssignments
     */
    void setUserRoleAssignments(Set<UserRoleAssignment> userRoleAssignments);
}
