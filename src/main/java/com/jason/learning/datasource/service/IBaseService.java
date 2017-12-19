package com.jason.learning.datasource.service;

import java.util.List;

public interface IBaseService<T> {

    public List<T> list(T entity);

    public T get(T entity);

    public int update(T entity);


    public int save(T entity);


    public int delete(T entity);
}