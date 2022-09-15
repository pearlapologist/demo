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
    public String home(Model model) { //''ru                                  'en'
        String[][] twoDimArray = {{"пон","вт","ср","чт","птн","сб","вск"}, {"mon","tuesday","wednesday","thursday","friday","saturday","sunday"}};
        model.addAttribute("val1", twoDimArray[0][0]);
        model.addAttribute("val2", twoDimArray[1][2]);
        return "home";
    }

}
