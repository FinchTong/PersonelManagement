package com.tong.pm.model;

import java.util.Set;

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
    Address getAddress();

    /**
     * set address
     * @param address
     */
    void setAddress(Address address);

    Set<UserRoleAssignment> getUserRoleAssignments();

    void setUserRoleAssignments(Set<UserRoleAssignment> userRoleAssignments);
}
