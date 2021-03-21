package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class DashboardController {
    @GetMapping("/dashboard")
    public String showDashboard(){
        return "dashboard";
    }
}
