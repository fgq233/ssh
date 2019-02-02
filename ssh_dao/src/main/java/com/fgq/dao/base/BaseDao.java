package com.fgq.dao.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class BaseDao<T> extends HibernateDaoSupport implements IBaseDao<T>{

    private Class<T> entityClazz;

    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    public Session getSession() {
        return getSessionFactory().getCurrentSession();
    }

    public BaseDao() {
        Type type = getClass().getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            this.entityClazz = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[0];
        } else {
            this.entityClazz = null;
        }
    }

    @Override
    public void save(T entity) {
        getHibernateTemplate().save(entity);
    }

    @Override
    public void saveOrUpdate(T entity) {
        getHibernateTemplate().saveOrUpdate(entity);
    }

    @Override
    public void delete(T entity) {
        getHibernateTemplate().delete(entity);
    }

    @Override
    public void update(T entity) {
        getHibernateTemplate().update(entity);
    }

    @Override
    public T find(Serializable id) {
        return getHibernateTemplate().get(entityClazz, id);
    }

    @Override
    public List<T> findAll() {
        String hql = "from " + entityClazz.getSimpleName();
        return (List<T>) getHibernateTemplate().find(hql);
    }
}
