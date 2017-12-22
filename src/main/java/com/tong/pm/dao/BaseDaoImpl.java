package com.tong.pm.dao;

import com.tong.pm.model.DataObject;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Finch
 */
@Repository(value = "baseDao")
@Transactional
public class BaseDaoImpl implements BaseDao{

    @Autowired
    protected SessionFactory sessionFactory;

    @Override
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void saveOrUpdate(DataObject object) {
        getSession().saveOrUpdate(object);
    }

    @Override
    public <T> T find(long oid, Class<T> clazz) {
        String hql = "from " + clazz.getName() + " as u where u.oid = :oid ";
        Map<String, Object> params = new HashMap<>(16);
        params.put("oid", oid);
        List<T> results = find(hql, params);
        if(!results.isEmpty()) {
            return results.get(0);
        }
        return null;
    }

    @Override
    public List find(String hql, Map<String, Object> params) {
        Session session = getSession();
        Query query = session.createQuery(hql);
        setParameter(query, params);
        return query.list();
    }

    @Override
    public void delete(DataObject object) {
        getSession().delete(object);
    }

    private void setParameter(Query query, Map<String, Object> params) {
        if(params != null && !params.isEmpty()) {
            for(Map.Entry<String, Object> entry : params.entrySet()) {
                if (entry.getValue() instanceof List) {
                    query.setParameterList(entry.getKey(), (List) entry.getValue());
                } else if (entry.getValue() instanceof String[]) {
                    query.setParameterList(entry.getKey(), (String[]) entry.getValue());
                } else if (entry.getValue() instanceof Long[]) {
                    query.setParameterList(entry.getKey(), (Long[]) entry.getValue());
                } else {
                    query.setParameter(entry.getKey(), entry.getValue());
                }
            }
        }
    }


}
