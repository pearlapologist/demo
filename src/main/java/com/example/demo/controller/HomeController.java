package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(@RequestParam("number") int number, @RequestParam("country") int country,
                       @RequestParam("dis") String dis, Model model) {
        double res = number * 400;
        if (country == 3) {
            res += res * 0.01;
        } else if (country == 2) {
            res += res * 0.12;
        }
        if (dis.equals("yes")) {
            res -= (res * 0.05);
        }
        model.addAttribute("res", res);
        return "home";
    }
}
