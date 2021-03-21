package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

    CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public String getList(Model model){
        model.addAttribute("list", customerService.getAll());
        return "list";
    }

    @GetMapping("/edit")
    public String showEdit(@RequestParam(value = "id", defaultValue = "0") int id, Model model){
        model.addAttribute("customer",customerService.getById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("customer") Customer customer){
        boolean result = customerService.update(customer);
        if (result)
            return "redirect:/customers";

        return "edit";
    }

    @GetMapping("/add")
    public String showAdd(@ModelAttribute("add") Customer customer){
        return "add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("add") Customer customer){
        customerService.add(customer);
        return "redirect:/customers";
    }

    @GetMapping("/delete")
    public String delete(@ModelAttribute("customer") Customer customer){
        boolean result = customerService.delete(customer);
        if (result)
            return "redirect:/customers";
        return "list";
    }
}
