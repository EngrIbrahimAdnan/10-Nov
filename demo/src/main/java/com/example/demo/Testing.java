package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Testing {
    public static void main(String[] args) {
        SpringApplication.run(Testing.class, args);
    }
    @RestController
    public class greetClass  {
        @GetMapping("/greet")
        String printFunction(@RequestParam(required = false, defaultValue = "friend") String name) {
            return "Hello, "+ name;
        }


        @PostMapping("/farewell")
        String goodbye(@RequestBody String name) {
            System.out.println("Goodbye, "+name);
            return "Goodbye, "+ name;
        }
    }
}
