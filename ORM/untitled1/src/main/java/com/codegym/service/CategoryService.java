package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.model.Post;
import com.codegym.repository.CategoryRepository;
import com.codegym.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(int id){
        return categoryRepository.findById(id);
    }

    public void saveOrUpdate(Category category){
        categoryRepository.save(category);
    }

    public void delete(int id){
        categoryRepository.deleteById(id);
    }
}
