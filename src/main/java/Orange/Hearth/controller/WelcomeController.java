//Prueba de que todo esta bien

package Orange.Hearth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1. Indica que es un controlador REST
public class WelcomeController {

    // 2. Mapea peticiones GET a la URL /welcome
    @GetMapping("/welcome") 
    public String sayWelcome() {
        return "¡Bienvenido a Orange Hearth! El controlador funciona.";
    }
}
