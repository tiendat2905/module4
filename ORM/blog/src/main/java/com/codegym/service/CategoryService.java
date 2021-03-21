package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    @Override
    public void saveOrUpdate(Category category){
        categoryRepository.save(category);
    }
    @Override
    public Optional<Category> findById(int id) {
        return categoryRepository.findById(id);
    }
    @Override
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }
}
