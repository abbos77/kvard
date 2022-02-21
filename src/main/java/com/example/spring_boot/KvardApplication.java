package com.example.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
@RestController
@RequestMapping("/users")
public class KvardApplication {

    @PostMapping("/adding")
    public  int adding(@RequestBody param a  ){
        return  a.getA() + a.getB() ;
    }
    public static void main(String[] args) {
        SpringApplication.run(KvardApplication.class, args);
        System.out.println("Hello Spring");
    }
}
