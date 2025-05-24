package com.example.microDos.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroDosController {

    @GetMapping("/microdos/test")
    public String microDos(){
        return "Consumiendo micro dos, puerto 8082";
    }

    @GetMapping("/consumo/MicroDos")
    public String consumirMicroDos(){
        return "Consumiendo micro dos, desde el micro uno";
    }

}
