package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public String showListCate(Model model){
        model.addAttribute("list", categoryService.findAll());
        return "category-list";
    }

    @GetMapping("/create")
    public String showAddCate(Model model){
        model.addAttribute("cate", new Category());
        return "category-create";
    }

    @PostMapping("/save")
    public String addCate(Category category, RedirectAttributes redirectAttributes){
         categoryService.saveOrUpdate(category);
        redirectAttributes.addFlashAttribute("message","Thêm mới thành công");
        return "redirect:/category/list";
    }


    @GetMapping("/{id}/edit")
    public String showEditCate(@PathVariable int id, Model model){
        model.addAttribute("cate", categoryService.findById(id));
        return "category-edit";
    }

    @PostMapping("/update")
    public String editCate(Category category, RedirectAttributes redirectAttributes){
        categoryService.saveOrUpdate(category);
        redirectAttributes.addFlashAttribute("message","Cập nhật thành công");
        return "redirect:/category/list";
    }

    @GetMapping("/{id}/delete")
    public String showDeleteCate(@PathVariable int id, Model model){
        model.addAttribute("cate", categoryService.findById(id));
        return "category-delete";
    }

    @PostMapping("/delete")
    public String deleteCate(Category category, RedirectAttributes redirectAttributes){
        categoryService.delete(category.getId());
        redirectAttributes.addFlashAttribute("message","Xóa thành công");
        return "redirect:/category/list";
    }
}
