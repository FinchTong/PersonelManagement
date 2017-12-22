package com.tong.pm.dao;

import com.tong.pm.model.DataObject;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

public interface BaseDao {

    Session getSession();

    void saveOrUpdate(DataObject object);

    <T> T find(long oid, Class<T> clazz);

    List find(String hql, Map<String, Object> params);

    void delete(DataObject object);

}
