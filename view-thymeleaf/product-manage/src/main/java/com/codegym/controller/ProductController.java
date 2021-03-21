package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {

    private ProductService productService = new ProductServiceImpl();

    @GetMapping("/")
    public String showList(Model model){
        model.addAttribute("products", productService.findAll());
        return "list";
    }

    @GetMapping("/product/create")
    public String showAdd(Model model){
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/product/save")
    public String add(Product product){
        product.setId((int) (Math.random() * 10000));
        productService.save(product);
        return "redirect:/";
    }

    @GetMapping("/product/{id}/edit")
    public String showEdit(@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "edit";
    }

    @PostMapping("/product/update")
    public String update(Product product){
        productService.update(product.getId(), product);
        return "redirect:/";
    }

    @GetMapping("/product/{id}/delete")
    public String showDelete(@PathVariable int id,Model model){
        model.addAttribute("product", productService.findById(id));
        return "delete";
    }

    @PostMapping("/product/delete")
    public String delete(Product product, RedirectAttributes redirectAttributes){
        productService.delete(product.getId());
        redirectAttributes.addFlashAttribute("mess","Remove success!!");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/view")
    public String showView(@PathVariable int id,Model model){
        model.addAttribute("product", productService.findById(id));
        return "view";
    }
}
