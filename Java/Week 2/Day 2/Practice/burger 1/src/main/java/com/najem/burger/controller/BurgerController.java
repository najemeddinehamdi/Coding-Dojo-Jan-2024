package com.najem.burger.controller;

import com.najem.burger.model.Burger;
import com.najem.burger.service.BurgerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BurgerController {
    @Autowired
    BurgerService burgerService;

    @GetMapping("/")
    public String home(@ModelAttribute("burger") Burger burger, Model model) {
        List<Burger> burgers=burgerService.findAllBurgers();
        model.addAttribute("burgers", burgers);
        return "burger.jsp";
    }

    @PostMapping("/addBurger")
    public String home(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if(result.hasErrors()) {
            List<Burger> burgers = burgerService.findAllBurgers();
            model.addAttribute("burgers", burgers);
            return "burger.jsp";
        }
        burgerService.createBurger(burger);
        return "redirect:/";
    }
}
