package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(@RequestParam("number") int number, Model model) {
        int res= number;
        if(number > 10){
            res = number + 100;
        }
        else{
            res =number- 30;
        }
        model.addAttribute("res", res);
        return "home";
    }
}
