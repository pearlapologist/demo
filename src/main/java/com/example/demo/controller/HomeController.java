package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(@RequestParam("number") int number, Model model) {
        String res="ноль";
        if(number == 1){
            res = "пон";
        }
        else if(number == 2){
            res = "вторник";
        }
        else if(number == 3){
            res = "среда";
        }
        else if(number == 4){
            res = "чт";
        }
        else if(number == 5){
            res = "пятница";
        }
        else if(number == 6){
            res = "суббота";
        }
        else if(number == 7){
            res = "воскресенье";
        }
        model.addAttribute("res", res);
        return "home";
    }
}
