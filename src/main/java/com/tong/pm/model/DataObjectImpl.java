package com.tong.pm.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * @author finch
 */
@MappedSuperclass
public class DataObjectImpl implements DataObject{

    @Id
    @GeneratedValue(generator = "hilo")
    @GenericGenerator(name = "hilo", strategy = "hilo")
    @Column(nullable = false)
    protected long oid;

    @Version
    protected  int doVersion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    private String createdByUserName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    private String updatedByUserName;

    @Type(type = "yes_no")
    private boolean active = true;

    @Override
    public long getOid() {
        return oid;
    }

    @Override
    public void setOid(long oid) {
        this.oid = oid;
    }

    @Override
    public int getDoVersion() {
        return doVersion;
    }

    @Override
    public void setDoVersion(int doVersion) {
        this.doVersion = doVersion;
    }

    @Override
    public Date getCreatedOn() {
        return createdOn;
    }

    @Override
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String getCreatedByUserName() {
        return createdByUserName;
    }

    @Override
    public void setCreatedByUserName(String createdByUserName) {
        this.createdByUserName = createdByUserName;
    }

    @Override
    public Date getUpdatedOn() {
        return updatedOn;
    }

    @Override
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String getUpdatedByUserName() {
        return updatedByUserName;
    }

    @Override
    public void setUpdatedByUserName(String updatedByUserName) {
        this.updatedByUserName = updatedByUserName;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void setActive(boolean active) {
        this.active = active;
    }
}
