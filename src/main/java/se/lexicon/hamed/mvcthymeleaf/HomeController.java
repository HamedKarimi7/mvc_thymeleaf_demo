package se.lexicon.hamed.mvcthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String defualtUrl(){
        System.out.println("#### defualt method has been executed! #####");
        return "index";
    }
    @GetMapping("/home")
    public String home(){
        System.out.println("#### home method has been executed! #####");
        return("index");

    }

    @GetMapping("/index")
    public String index(){
        System.out.println("#### index method has been executed! #####");
        return ("index");
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        System.out.println("#### index method has been executed! #####");
        return ("dashboard");
    }
}
