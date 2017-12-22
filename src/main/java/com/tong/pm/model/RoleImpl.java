package com.tong.pm.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pm_role")
public class RoleImpl extends DataObjectImpl implements Role{

    @Column(length = 128, unique = true, nullable = false)
    private String externalReference;

    @Column(length = 64)
    private String name;

    @Column(length = 512)
    private String description;

    @OneToMany(targetEntity = UserRoleAssignmentImpl.class, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "roleId")
    private Set<UserRoleAssignment> userRoleAssignments;

    @Override
    public String getExternalReference() {
        return externalReference;
    }

    @Override
    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
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
        return "RoleImpl{" +
                "externalReference='" + externalReference + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", userRoleAssignments=" + userRoleAssignments +
                '}';
    }
}
