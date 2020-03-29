package io.javabrains.coronavirustracker.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String home() {
        return "home";
    }
}
