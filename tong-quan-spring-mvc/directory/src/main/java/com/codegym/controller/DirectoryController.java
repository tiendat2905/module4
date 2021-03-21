package com.codegym.controller;


import com.codegym.service.DirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DirectoryController {

    DirectoryService directoryService;

    @Autowired
    public void setDirectoryService(DirectoryService directoryService) {
        this.directoryService = directoryService;
    }

    @GetMapping("/directory")
    public String search() {
        return "search";
    }

    @PostMapping("/search")
    public String Directory(@RequestParam String keyword, Model model) {
        model.addAttribute("result", directoryService.lookUp(keyword));
        return "result";
    }
}
