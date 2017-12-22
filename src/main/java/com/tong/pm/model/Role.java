package com.tong.pm.model;

import java.util.Set;

public interface Role extends DataObject{

    String getExternalReference();

    void setExternalReference(String externalReference);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    Set<UserRoleAssignment> getUserRoleAssignments();

    void setUserRoleAssignments(Set<UserRoleAssignment> userRoleAssignments);

}
