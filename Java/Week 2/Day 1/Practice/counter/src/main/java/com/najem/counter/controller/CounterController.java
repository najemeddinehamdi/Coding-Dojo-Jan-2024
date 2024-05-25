package com.najem.counter.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
    @RequestMapping("/counter")
    public String index(HttpSession session) {

        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        }
        else {
            int countt = (Integer) session.getAttribute("count");
            session.setAttribute("count",countt+1);
        }
        return "main";

    }

}
