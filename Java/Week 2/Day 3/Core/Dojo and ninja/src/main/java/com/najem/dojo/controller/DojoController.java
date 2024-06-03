package com.najem.dojo.controller;
import org.springframework.ui.Model;
import com.najem.dojo.model.Dojo;
import com.najem.dojo.model.Ninja;
import com.najem.dojo.service.DojoSevice;
import com.najem.dojo.service.NinjaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DojoController {
    private final DojoSevice dojoSevice;
    public DojoController(DojoSevice dojoSevice) {
        this.dojoSevice = dojoSevice;
    }

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("Dojo") Dojo dojo) {
        return "dojo.jsp";
    }
    @PostMapping("/processDojo")
    public String createDojo(@Valid @ModelAttribute("Dojo") Dojo dojo , BindingResult Result ,Model model) {
        if (Result.hasErrors()) {
            return "dojo.jsp";
        }else{
            Dojo newDojo= dojoSevice.createDojo(dojo);
            return "redirect:/all/dojos";
        }
    }
    @GetMapping("/dojos/{id}")
    public String AllDojo(@PathVariable("id") Long id, Model model ) {
        List<Dojo> allDojos=dojoSevice.getAllDojos();
        model.addAttribute("dojos" ,allDojos);
        Dojo dojo = dojoSevice.getDojoById(id);
        if (dojo != null) {
            model.addAttribute("dojo", dojo);
        } else {
            model.addAttribute("error", "Dojo not found");
        }
        return "location.jsp";
    }
}
