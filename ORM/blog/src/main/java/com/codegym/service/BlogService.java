package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BlogService implements IBlogService {

    @Autowired
    private BlogRepository blogRepository;
    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
    @Override
    public void saveOrUpdate(Blog blog) {
        blogRepository.save(blog);
    }
    @Override
    public Optional<Blog> findById(int id) {
        return blogRepository.findById(id);
    }
    @Override
    public void delete(int id){
        blogRepository.deleteById(id);
    }

    @Override
    public List<Blog> findTop3(){
        return blogRepository.findTop3ByOrderByPublishDateDesc();
    }

    @Override
    public List<Blog> findTop5(){
        return blogRepository.findTop5ByOrderByPublishDateDesc();
    }

    @Override
    public List<Blog> findTop8(){
        return blogRepository.findTop8ByOrderByPublishDateDesc();
    }
}
