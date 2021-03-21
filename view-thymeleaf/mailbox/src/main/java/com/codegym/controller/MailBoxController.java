package com.codegym.controller;

import com.codegym.model.MailBox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailBoxController {
    @GetMapping("/mailbox")
    public String showMail(Model model){
        model.addAttribute("mailbox", new MailBox());
        return "create";
    }

    @PostMapping("/addMail")
    public String add(@ModelAttribute("mailbox") MailBox mailBox, Model model){
        model.addAttribute("languages",mailBox.getLanguages());
        model.addAttribute("pageSize", mailBox.getPageSize());
        model.addAttribute("spamsFitter",mailBox.getSpamsFitter());
        model.addAttribute("signature",mailBox.getSignature());
        return "info";
    }
}
