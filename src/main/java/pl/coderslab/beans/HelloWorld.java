package pl.coderslab.beans;

import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@Controller
public class HelloWorld {
    public void hello(){
        System.out.println(LocalDateTime.now());
    }
}
