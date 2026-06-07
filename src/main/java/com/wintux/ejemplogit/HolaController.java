package com.wintux.ejemplogit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
public class HolaController {
    @Value("${DB_PASSWORD}")
    private String password;

    @GetMapping("/hola")
    public String saludar() {
        return "Hola Mundo desde Spring Boot";
    }

    @GetMapping("/adios")
    public String despedirse() {
        return "Hasta luego";
    }

    @GetMapping("/hola2")
    public String saludarPersonalizado() {
        System.out.println("El valor de la ENV es: " + password);
        return "Hola " + password + " desde Spring Boot";
    }

}
