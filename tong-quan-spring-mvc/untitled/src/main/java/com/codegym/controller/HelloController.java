package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class HelloController {
    @GetMapping("/home")
    public String showAll(@RequestParam(value = "name", defaultValue = "") String name, Model model){
        model.addAttribute("name",name);
        return "home";
    }

    @GetMapping("home/{name}")
    public String showAll2(@PathVariable String name, Model model){
        model.addAttribute("name",name);
        return "home";
    }
}
