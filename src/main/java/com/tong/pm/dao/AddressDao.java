package com.tong.pm.dao;

import com.tong.pm.model.Address;
import com.tong.pm.model.DataObject;

public interface AddressDao extends BaseDao{

    void save(Address address);

    void delete(Address address);

    Address findByOid(long oid);
}
