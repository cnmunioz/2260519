package com.wintux.ejemplogit;
import org.springframework.web.bind.annotation.*;


@RestController
public class HolaController {

    @GetMapping("/hola")
    public String saludar() {
        return "Hola Mundo desde Spring Boot";
    }

}
