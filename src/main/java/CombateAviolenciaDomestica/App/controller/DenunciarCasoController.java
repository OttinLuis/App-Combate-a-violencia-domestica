package CombateAviolenciaDomestica.App.controller;

import CombateAviolenciaDomestica.App.models.DenunciarCaso;
import CombateAviolenciaDomestica.App.repository.DenunciarCasoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DenunciarCasoController {

    @Autowired
    private DenunciarCasoRepository denunciarCasoRepository;

    // Página do formulário
    @GetMapping("/denunciar")
    public String mostrarFormulario(Model model) {
        model.addAttribute("denuncia", new DenunciarCaso());
        return "denuncia"; // denuncia.html
    }

    // Salva no banco
    @PostMapping("/denuncia/salvar")
    public String salvar(DenunciarCaso denuncia) {
        denunciarCasoRepository.save(denuncia);
        return "redirect:/denuncia/sucesso";
    }

    // Página de sucesso
    @GetMapping("/denuncia/sucesso")
    public String sucesso() {
        return "denunciar-sucesso"; // denunciar-sucesso.html
    }
}
