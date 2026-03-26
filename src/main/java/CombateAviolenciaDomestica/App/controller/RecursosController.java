package CombateAviolenciaDomestica.App.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecursosController {

    @GetMapping("/recursos")
    public String recursos() {
        return "recursos/recursos";
    }
}
