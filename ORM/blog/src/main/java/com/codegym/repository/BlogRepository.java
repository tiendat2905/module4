package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

    List<Blog> findTop8ByOrderByPublishDateDesc();

    List<Blog> findTop3ByOrderByPublishDateDesc();

    List<Blog> findTop5ByOrderByPublishDateDesc();
}
