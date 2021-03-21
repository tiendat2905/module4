package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;

public interface IBlogService extends IBaseService<Blog> {

    List<Blog> findTop3();
    List<Blog> findTop5();
    List<Blog> findTop8();
}
