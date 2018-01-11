package com.tong.pm.dao;

import com.tong.pm.model.Address;

public class AddressDaoImpl extends BaseDaoImpl implements AddressDao{
    @Override
    public void save(Address address) {
        super.saveOrUpdate(address);
    }

    @Override
    public void delete(Address address) {
         super.delete(address);
    }

    @Override
    public Address findByOid(long oid) {
        return super.find(oid, Address.class);
    }
}
