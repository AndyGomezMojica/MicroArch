package com.example.microUno.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "micro-dos")
public interface MicroDosFeing {

    @GetMapping("/consumo/MicroDos")
    public String consumirMicroDos();
}
