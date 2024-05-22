package najem.example.DaikichiRoutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DaikichiController {
    @RequestMapping("")
    public String daikichi() {
        return "Welcome";
    }
    @RequestMapping("/today")
    public String today() {
        return "today you will find luck in all your endeavors";
    }
    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "tomorrow an opportunity will arise";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Human";
    }
    @RequestMapping("/hello2")
    public String hello2(@RequestParam (required = false) String name ,String lastname ) {
        return "Hello " + name+lastname ;
    }
    @RequestMapping("/hello3")
    public String hello3(@RequestParam(required = false) String name ,  @RequestParam int times) {
        StringBuilder repeatedGreeting = new StringBuilder();
        for (int i = 0; i < times; i++) {
            repeatedGreeting.append(name).append("aaa ");
        }
        return repeatedGreeting.toString().trim();
    }
    }




