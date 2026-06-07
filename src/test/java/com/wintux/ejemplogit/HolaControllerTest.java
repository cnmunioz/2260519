package com.wintux.ejemplogit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HolaControllerTest {
    @Test
    void testHolaController(){
        HolaController controller = new HolaController();
        String respuesta = controller.saludar();
        assertEquals("Hola Mundo desde Spring Boot", respuesta);
    }
}
