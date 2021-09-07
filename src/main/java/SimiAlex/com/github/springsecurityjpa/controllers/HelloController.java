package SimiAlex.com.github.springsecurityjpa.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String hello(){
        return "Hello";
    }
}
