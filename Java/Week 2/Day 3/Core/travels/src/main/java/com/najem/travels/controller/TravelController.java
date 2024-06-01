package com.najem.travels.controller;

import org.springframework.ui.Model;
import com.najem.travels.model.Travels;
import com.najem.travels.service.TravelService;
import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class TravelController {
    private final TravelService travelService;

    public TravelController(TravelService travelService) {
        this.travelService = travelService;
    }

    @GetMapping("/expenses")
    public String newTravel(@ModelAttribute("travel") Travels travel, Model model) {
        List<Travels> travelList = travelService.getAllTravels();
        model.addAttribute("travelList", travelList);
        return "new.jsp";
    }

    @PostMapping("/processTravel")
    public String createTravel(@Valid @ModelAttribute("travel") Travels travel, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            List<Travels> travelList = travelService.getAllTravels();
            model.addAttribute("travelList", travelList);
            return "new.jsp";
        } else {
            travelService.createTravel(travel);
            return "redirect:/expenses";
        }
    }
    @GetMapping("/travel/edit/{id}")
    public String updateTravel(@PathVariable("id") Long id, Model model) {
        Travels travel = travelService.getTravelById(id);
        model.addAttribute("travel", travel);
        return "edit.jsp";
    }
    @GetMapping("/show/travel/{id}")
    public String showTravel(@PathVariable("id") Long id, Model model) {
        Travels travel = travelService.getTravelById(id);
        model.addAttribute("travel", travel);
        return "Show.jsp";
    }
    @PutMapping("/updateTravel/{id}")
    public String updateTravel(@Valid @ModelAttribute("travel") Travels travel, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "edit.jsp";
        }else{
            travelService.updateTravel(travel);
        }
        return "redirect:/expenses";
    }
    @DeleteMapping("/travel/delete/{id}")
    public String deleteTravel(@PathVariable("id") Long id){
        travelService.deleteTravel(id);
        return "redirect:/expenses";
    }

}
