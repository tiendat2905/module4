package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.model.Post;
import com.codegym.service.CategoryService;
import com.codegym.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private PostService postService;

    @GetMapping("/list")
    @ResponseBody
    public String showList(){
        Category category = new Category(1,"Food");

        Post post = new Post(1,"lfsdf","dfgdsfgsd","dfgdsfgdfs");
        post.setCategory(category);
        categoryService.saveOrUpdate(category);
        postService.saveOrUpdate(post);
        return "abc";
    }
}
