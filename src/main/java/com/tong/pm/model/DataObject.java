package com.tong.pm.model;

import java.util.Date;

public interface DataObject {
    long getOid();

    void setOid(long oid);

    int getDoVersion();

    void setDoVersion(int doVersion);

    Date getCreatedOn();

    void setCreatedOn(Date createdOn);

    String getCreatedByUserName();

    void setCreatedByUserName(String createdByUserName);

    Date getUpdatedOn();

    void setUpdatedOn(Date updatedOn);

    String getUpdatedByUserName();

    void setUpdatedByUserName(String updatedByUserName);

    boolean isActive();

    void setActive(boolean active);
}
