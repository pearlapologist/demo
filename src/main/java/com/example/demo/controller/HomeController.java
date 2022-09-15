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
    public String home(@RequestParam("dep_sum") int dep_sum,@RequestParam("dep_months") int dep_months, Model model) {
       double vr = 0.13/12;
       vr += 1;
       vr = Math.pow(vr, dep_months);
        double res = dep_sum*vr;
        model.addAttribute("res", res);
        model.addAttribute("profit", (res-dep_sum)/dep_months);
        model.addAttribute("dep_sum", dep_sum);
        return "home";
    }

}
