package CombateAviolenciaDomestica.App.controller;

import CombateAviolenciaDomestica.App.models.SuportePsicologico;
import CombateAviolenciaDomestica.App.repository.SuportePsicologicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SuportePsicologicoController {

    @Autowired
    private SuportePsicologicoRepository suportePsicologicoRepository;

    @GetMapping("/suporte/psicologico")
    public String mostrarPaginaSuporte(Model model) {
        List<SuportePsicologico> suportes = suportePsicologicoRepository.findAll();
        model.addAttribute("suportes", suportes);
        return "suporte-psicologico";
    }
}
