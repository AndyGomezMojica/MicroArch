package com.example.microUno.web;

import com.example.microUno.feing.MicroDosFeing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroUnoController {

    @Autowired
    MicroDosFeing microDosFeing;

    @GetMapping("/microUno/test")
    public String microUno(){
        return "Consumiendo micro uno, puerto 8081";
    }

    @GetMapping("/consumoMicroDos")
    public String consumirMicroDosDesdeMicroUno(){
        return "Resultado de consumir micro dos. Mensaje: " + microDosFeing.consumirMicroDos();
    }

}
