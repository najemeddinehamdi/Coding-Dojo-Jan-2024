package com.najem.fruit.controller;

import com.najem.fruit.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(Model model) {

        ArrayList<Item> fruits = new ArrayList<Item>();
        fruits.add(new Item("Kiwi", 1.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Koji Berries", 4.0));
        fruits.add(new Item("Guava", .75));

        // Add fruits your view model here
        model.addAttribute("fruit", fruits);


        return "index";
    }
}
