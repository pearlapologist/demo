package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        String[] array = new String[] { "Привет,", "мир", "!"};
        array[0] = "Пока,";
        String var = " ";
        for(String word : array){
           var+=word;
        }
        model.addAttribute("array", var);
        return "home";
    }

}
