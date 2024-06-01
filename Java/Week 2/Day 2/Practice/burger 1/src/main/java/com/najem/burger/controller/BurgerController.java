package com.najem.burger.controller;

import com.najem.burger.model.Burger;
import com.najem.burger.service.BurgerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/edit/{id}")
    public String editBurger(@PathVariable("id") Long id, Model model) {
        model.addAttribute("burger", burgerService.findBurger(id));
        return "edit.jsp";
    }

    @PutMapping("/edit/{id}")
    public String updateBurger( @PathVariable("id") Long id, @Valid @ModelAttribute("burger") Burger burger, BindingResult result,Model model) {
        if(result.hasErrors()) {
            model.addAttribute("burger", burgerService.findBurger(id));
            return "burger.jsp";
        }
        burgerService.updateBurger(burger);
        return "redirect:/";
    }
}
