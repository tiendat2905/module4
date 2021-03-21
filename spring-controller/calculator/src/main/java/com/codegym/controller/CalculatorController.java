package com.codegym.controller;

import com.codegym.model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String showView(Model model){
        model.addAttribute("cal", new Calculator());
        return "index";
    }

    @PostMapping("/calculate")
    public String doAddition(@ModelAttribute("cal") Calculator calculator, Model model) {
        switch (calculator.getOperator()){
            case '+':
                calculator.setTotal( calculator.getFirstOperand() + calculator.getSecondOperand());
                break;
            case '-':
                calculator.setTotal( calculator.getFirstOperand() - calculator.getSecondOperand());
                break;
            case '*':
                calculator.setTotal(calculator.getFirstOperand() * calculator.getSecondOperand());
                break;
            case '/':
                if (calculator.getSecondOperand() != 0){
                    calculator.setTotal(calculator.getFirstOperand() / calculator.getSecondOperand());
                }else {
                    model.addAttribute("mess","khong the chia cho 0");
                }
                break;
            default:
                model.addAttribute("mess","khong hop le");
        }
        return "result";
    }

}
