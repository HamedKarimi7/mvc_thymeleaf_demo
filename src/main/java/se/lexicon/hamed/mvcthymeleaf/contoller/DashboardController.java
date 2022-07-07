package se.lexicon.hamed.mvcthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard(){
        System.out.println("#### dashboard method has been executed! ####");
        return ("dashboard");

    }
}
