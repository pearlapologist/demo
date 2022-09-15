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
        String[] array = new String[] { "a", "b", "c", "d"};
        model.addAttribute("var", array[0]+"+"+ array[1]+", "+array[2]+"+"+array[3]);
        return "home";
    }

}
