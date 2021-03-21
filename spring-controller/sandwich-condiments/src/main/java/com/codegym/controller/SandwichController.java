package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class SandwichController {
    @GetMapping("/sandwich")
    public String show(){
        return "list";
    }

    @PostMapping("/save")
    public String save(@RequestParam("condiment") List<String> condiment,Model model){
        System.out.println(condiment);
        model.addAttribute("condiment",condiment);
        return "result";
    }


}
