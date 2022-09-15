package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        int res =0;
        int[] array = new int[] {1,2,3,4,5,6,7};
        for (int num : array) {
            res += num;
        }
        model.addAttribute("res", res);
        return "home";
    }

}
