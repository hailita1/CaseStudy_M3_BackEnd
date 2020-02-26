package com.codegym.blog.service;

public interface GeneralService<T> {
    Iterable<T> findAll();

    T findById(Long id);

    void save(T model);

    void remove(Long id);
}
