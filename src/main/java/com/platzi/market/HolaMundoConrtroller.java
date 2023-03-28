package com.platzi.market;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/saludar")


public class HolaMundoConrtroller {

    @GetMapping("/hola")
    public String saludar() {
        return "Hola Mundo";
    }

}
