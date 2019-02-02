package com.fgq.dao.base;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao<T> {


    void save(T entity);

    void saveOrUpdate(T entity);

    void delete(T entity);

    void update(T entity);

    T find(Serializable id);

    List<T> findAll();
}
