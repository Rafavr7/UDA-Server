package com.rvr.uda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class UdaServerStarter {
    
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
	SpringApplication.run(UdaServerStarter.class, args);
    }
    
    @GetMapping("/home")
    public String homePage() {
        return "home";
    }

}
