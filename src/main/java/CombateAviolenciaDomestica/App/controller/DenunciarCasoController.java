package CombateAviolenciaDomestica.App.controller;

import CombateAviolenciaDomestica.App.models.DenunciarCaso;
import CombateAviolenciaDomestica.App.repository.DenunciaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DenunciarCasoController {

    @Autowired
    private DenunciaRepository denunciarCasoRepository;

    // Página do formulário
    @GetMapping("/denunciar")
    public String mostrarFormulario(Model model) {
        model.addAttribute("denuncia", new DenunciarCaso());
        return "denuncia/denuncia";
    }

    // Salva no banco
    @PostMapping("/denuncia/salvar")
    public String salvar(@Valid DenunciarCaso denuncia, BindingResult resultado, Model model){
        if (resultado.hasErrors()){
            model.addAttribute("denuncia", denuncia);
            return "denuncia/denuncia";
        }
        denunciarCasoRepository.save(denuncia);
        return "redirect:/denuncia/sucesso";
    }


    // Página de sucesso
    @GetMapping("/denuncia/sucesso")
    public String sucesso() {
        return "denuncia/denunciar-sucesso"; // denunciar-sucesso.html
    }
}
