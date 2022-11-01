package com.bruno.springappdocker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class HealthcheckController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    private String healthcheck(){
        System.out.println("Chamada realizada com sucesso");
        return "API funcionando";
    }
}
