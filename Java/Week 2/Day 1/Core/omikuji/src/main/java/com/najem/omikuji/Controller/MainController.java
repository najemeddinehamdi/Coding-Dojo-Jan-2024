package com.najem.omikuji.Controller;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {
    @GetMapping("/omikuji")
    public String s() {
        return "form";
    }
    @PostMapping( "/omikuji")
    public String omikuji (HttpSession session ,
                           @RequestParam("num") int num,
                           @RequestParam("city") String city,
                           @RequestParam("person") String person,
                           @RequestParam("hobby")String hobby,
                           @RequestParam("thing") String thing,
                           @RequestParam("nice")String nice){
        session.setAttribute("num", num);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hobby", hobby);
        session.setAttribute("thing", thing);
        session.setAttribute("nice", nice);
        return "redirect:/omikuji/show";
    }
    @GetMapping("/omikuji/show")
    public String show(HttpSession session){
        return "show";
    }

}
