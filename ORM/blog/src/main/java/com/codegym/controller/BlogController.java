package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.IBlogService;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public String listBlog(Model model){
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("list",blogList);
        return "blog-list";
    }

    @GetMapping("/create")
    public String showAdd(Model model){
        Blog blog = new Blog();
        blog.setCategory(new Category());
        model.addAttribute("blog", blog);
        model.addAttribute("categories", categoryService.findAll());
        return "blog-create";
    }

    @PostMapping("/save")
    public String add(Blog blog, RedirectAttributes redirectAttributes){
        blogService.saveOrUpdate(blog);
        redirectAttributes.addFlashAttribute("message","Thêm mới thành công");
        return "redirect:/blog/list";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, Model model){
        model.addAttribute("categories",categoryService.findAll());
        model.addAttribute("blog",blogService.findById(id));
        return "blog-edit";
    }

    @PostMapping("/update")
    public String update(Blog blog, RedirectAttributes redirectAttributes){
        blogService.saveOrUpdate(blog);
        redirectAttributes.addFlashAttribute("message","Cập nhật thành công");
        return "redirect:/blog/list";
    }

    @GetMapping("/{id}/delete")
    public String showDelete(@PathVariable int id, Model model){
        model.addAttribute("categories",categoryService.findAll());
        model.addAttribute("blog",blogService.findById(id));
        return "blog-delete";
    }

    @PostMapping("/delete")
    public String delete(Blog blog,RedirectAttributes redirectAttributes){
        blogService.delete(blog.getId());
        redirectAttributes.addFlashAttribute("message","Xóa thành công");
        return "redirect:/blog/list";
    }
}
