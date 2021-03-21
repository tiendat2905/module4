package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBaseService<T> {
    List<T> findAll();
    void saveOrUpdate(T object);
    Optional<T> findById(int id);
    void delete(int id);
}
