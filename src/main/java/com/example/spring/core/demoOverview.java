package com.example.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class demoOverview {

        // expose "/" that return "Hello World"

        @GetMapping("/")
        public String sayHello() {
            return "Hello World!";
        }

        // expose a new endpoints

        @GetMapping("/workout")
        public String getDailyWorkout() {
            return "Run a hard 5k!";
        }

        // expose a new endpoints

        @GetMapping("/fortune")
        public String getDailyFortune() {
            return "Today is your lucky day.";
        }

    }

