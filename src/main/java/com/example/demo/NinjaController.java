package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boas_vindas")
    public String boasvindas(){
        return "Bem-vindo ao nosso sistema!";
    }
}
