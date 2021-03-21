package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {

    private  CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public String showList(Model model){
        model.addAttribute("customer", customerService.findAll());
        return "list";
    }

    @GetMapping("customer/create")
    public String showAdd(Model model){
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("customer/create")
    public String add(Customer customer){
        customerService.save(customer);
        return "redirect:/customers";
    }


    @GetMapping("customer/{id}/edit")
    public String showEdit(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findOne(id));
        return "edit";
    }

    @PostMapping("customer/update")
    public String Update(Customer customer){
        customerService.update(customer);
        return "redirect:/customers";
    }

    @GetMapping("customer/{id}/delete")
    public String showDelete(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findOne(id));
        return "delete";
    }

    @PostMapping("customer/delete")
    public String delete(Customer customer, RedirectAttributes redirectAttributes){
        customerService.delete(customer.getId());
        redirectAttributes.addFlashAttribute("mess","remove success!");
        return "redirect:/customers";
    }

    @GetMapping("/customer/{id}/view")
    public String view(@PathVariable int id,Model model){
        model.addAttribute("customer",customerService.findOne(id));
        return "view";
    }

}
