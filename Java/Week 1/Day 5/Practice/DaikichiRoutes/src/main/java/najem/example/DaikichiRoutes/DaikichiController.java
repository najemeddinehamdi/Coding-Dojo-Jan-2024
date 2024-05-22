package najem.example.DaikichiRoutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
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
}
