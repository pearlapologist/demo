package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(@RequestParam("first_number") int first_number,@RequestParam("second_number") int second_number, Model model) {
        model.addAttribute("add", first_number + second_number);
        model.addAttribute("mul", first_number*second_number);
        return "home";
    }
}
