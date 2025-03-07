package com.example.uygulama.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    
@RestController
public class TestController {

    @GetMapping("/deneme")
    public String deneme() {
        return "Uygulama çalışıyor - Sunucu: " + System.getenv().getOrDefault("HOSTNAME", "unknown");
    }
} 

