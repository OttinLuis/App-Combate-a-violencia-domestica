package CombateAviolenciaDomestica.App.controller;

import CombateAviolenciaDomestica.App.models.RedeDeApoio;
import CombateAviolenciaDomestica.App.repository.RedeDeApoioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedeDeApoioController {

    @Autowired
    private RedeDeApoioRepository repository;

    @GetMapping("/rede-apoio")
    public String listar(Model model) {
        model.addAttribute("ongs", repository.findAll());
        return "rede/rede-apoio";
    }
}
