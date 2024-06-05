package com.oussama.belt_demo.controllers;


import com.oussama.belt_demo.models.Library;
import com.oussama.belt_demo.services.LibraryService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LibraryController {

    private final LibraryService libraryService;

    public  LibraryController(LibraryService libraryService){
        this.libraryService = libraryService;
    }


    // -------------------------------- DISPLAY ROUTE ------------------------
    @GetMapping("/libraries")
    public String libraries (Model model, @ModelAttribute("library") Library library) {
        List<Library> libraries = libraryService.allLibrary();
        model.addAttribute("allLibrary", libraries);
        return "library/libs";
    }

    // -------------------------------- ACTION ROUTE --------------------------
    @PostMapping("/libraries")
    public String createLibrary(
            @Valid @ModelAttribute("library") Library library,
            BindingResult result,
            Model model){
        if(result.hasErrors()){
            List<Library> libraries = libraryService.allLibrary();
            model.addAttribute("allLibrary", libraries);
            return "library/libs";
        } else {
            libraryService.createLibrary(library);
            return "redirect:/libraries";
        }
    }

    // -------------------------------- DISPLAY ROUTE FOR ONE LIBRARY -----------------------------
    @GetMapping("/libraries/{id}")
    public String showLibrary (@PathVariable("id") Long id, Model model){
        Library thisLibrary = libraryService.findLibrary(id);
        model.addAttribute("library", thisLibrary);
        return "library/oneLibrary";
    }
}
