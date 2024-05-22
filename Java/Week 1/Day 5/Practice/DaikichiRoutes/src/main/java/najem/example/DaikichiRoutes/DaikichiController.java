package najem.example.DaikichiRoutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @RequestMapping("/{action}/{place}")
    public String travling(@PathVariable ("action")String action, @PathVariable ("place")String place){
        return "Congratulations! you will soon "+action+" to "+place;
    }
    @RequestMapping("/lotto/{num}")
    public String travling2( @PathVariable ("num")Integer num){
        if (num % 2==0){
            return "You will take a grand journey in the near future, but be weary of tempting offers";
        }
        else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }

    }

}



