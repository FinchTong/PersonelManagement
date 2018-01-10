package com.tong.pm.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pm_address")
public class AddressImpl extends DataObjectImpl implements Address{

    private String addressDetail;

    @OneToOne(targetEntity = UserImpl.class)
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public String getAddressDetail() {
        return addressDetail;
    }

    @Override
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }
}
