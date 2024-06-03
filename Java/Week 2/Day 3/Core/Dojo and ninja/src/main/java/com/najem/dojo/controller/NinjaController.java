package com.najem.dojo.controller;
import com.najem.dojo.model.Dojo;
import com.najem.dojo.repository.DojoRepository;
import com.najem.dojo.service.DojoSevice;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;

import com.najem.dojo.model.Ninja;
import com.najem.dojo.service.NinjaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class NinjaController {
    private final NinjaService ninjaServ;
    private final DojoSevice dojoSevice;


    private DojoRepository dojoRepository;

    @GetMapping("/ninja/new")
    public String newNinja(@ModelAttribute("Ninja") Ninja ninja ,Model model ) {
        List<Dojo> dojos = dojoSevice.getAllDojos();

        model.addAttribute("dojos", dojos);
        return "ninja.jsp";
    }
    @PostMapping("/processNinja")
    public String createNinja(@Valid @ModelAttribute("Ninja") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
            return "ninja.jsp";
        }else {
            Ninja newNinja=ninjaServ.createNinja(ninja);
            System.out.println(ninja.getDojo());
            return "redirect:/dojos/new";
        }
    }
    @GetMapping("/all/dojos")
    public String showDojos( Model model) {
        List<Dojo> dojos = dojoSevice.getAllDojos();
        model.addAttribute("dojos", dojos);
        return "location.jsp";
    }

    @GetMapping("/Dojo/{id}")
    public String getDoja(
            @PathVariable long id,
            Model model
    ){
        Optional<Dojo> optional = this.dojoRepository.findById(id);
        if(optional.isPresent()){
            model.addAttribute("dojoo", optional.get());
            return "location.jsp";

        }
        return null;
    }

}
