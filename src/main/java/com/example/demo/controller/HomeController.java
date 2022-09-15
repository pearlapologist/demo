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
    public String home(@RequestParam(value = "gum", defaultValue = "n") String gum, @RequestParam(value = "quantity_gum", defaultValue = "0") int quantity_gum,
                       @RequestParam(value = "bread", defaultValue = "n") String bread, @RequestParam(value = "quantity_bread", defaultValue = "0") int quantity_bread,
                       @RequestParam(value = "mayo", defaultValue = "n") String mayo, @RequestParam(value = "quantity_mayo", defaultValue = "0") int quantity_mayo,
                       @RequestParam(value = "kvas", defaultValue = "n") String kvas, @RequestParam(value = "quantity_kvas", defaultValue = "0") int quantity_kvas,
                       Model model) {
       double res =0;
        if (gum.equals("y")) {
          res+=quantity_gum*10;
        }
        if (bread.equals("y")) {
            res+=quantity_bread*150;
        }
        if (mayo.equals("y")) {
            res+=quantity_mayo*200;
        }
        if (kvas.equals("y")) {
            res+=quantity_kvas*350;
        }
        double a = 500-res;
        if(a>0){
            model.addAttribute("res", "Платеж прошел, остаток:"+a);
        }else{
        model.addAttribute("res", "Недостаточно средств");}
        return "home";
    }

}
