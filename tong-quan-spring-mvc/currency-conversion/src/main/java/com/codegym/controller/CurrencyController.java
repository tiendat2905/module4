package com.codegym.controller;

import com.codegym.model.CurrencyConversion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CurrencyController {

    @GetMapping("/convert")
    public String showCurrency(@ModelAttribute("convert") CurrencyConversion currencyConversion) {
        return "convert";
    }

    @PostMapping("/convert")
    public String convertVND(@ModelAttribute("convert") CurrencyConversion currencyConversion) {
        double total = currencyConversion.getAmount() * currencyConversion.getRate();
        currencyConversion.setTotal(total);
        return "result";
    }
}
