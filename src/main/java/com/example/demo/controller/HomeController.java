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
        System.out.println("#1");
        String[] array = new String[10];
       for(int i=0;i<10;i++){
           array[i]="x";
           System.out.println(array[i]);
       }
        System.out.println("#2");
        int[] array2 = new int[10];
        for(int i=0;i<10;i++){
            array2[i]=i+1;
            System.out.println(array2[i]);
        }
        System.out.println("#3");
        String[] array3 = {"html", "css", "php", "js", "jq"};
        for (String w : array3) {
            System.out.print(w +"\n");
        }

        System.out.println("#4");
        int[] array4 = {1, 2, 3, 4, 5};
        int result=0;
        for (int t : array4) {
            result+=t*t;
        }
        System.out.println(result);

        System.out.println("#5");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kolya", 200);
        map.put("Vasya", 300);
        map.put("Petya", 400);
        map.forEach((k, v) -> System.out.println((k + " - salary " + v+"$")));
        return "home";
    }

}
