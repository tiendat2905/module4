package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class HomeController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/home")
    public String homeView(Model model){
        Blog bLog = new Blog();
        model.addAttribute("blog", blogService.findById(bLog.getId()));
        model.addAttribute("list3Blogs",blogService.findTop3());
        model.addAttribute("list5Popular",blogService.findTop5());
        model.addAttribute("list8Blogs",blogService.findTop8());
        model.addAttribute("listCat",categoryService.findAll());
        return "home";
    }
}
