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
    public String home(@RequestParam("number") int number, Model model) {
        HashMap<Integer, String> serializedMap = new HashMap<>();
        serializedMap.put(1, "пон");
        serializedMap.put(2, "вт");
        serializedMap.put(3, "ср");
        serializedMap.put(4, "чт");
        serializedMap.put(5, "пятница");
        serializedMap.put(6, "суб");
        serializedMap.put(7, "вс");

        String var  = serializedMap.get(number);
        model.addAttribute("map", var);
        return "home";
    }

}
