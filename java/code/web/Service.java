package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class Service{
    
    @GetMapping("/")
    String x(){
        return "home";
    }
}