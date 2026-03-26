package CombateAviolenciaDomestica.App.controller;

import CombateAviolenciaDomestica.App.repository.DenunciaRepository;
import CombateAviolenciaDomestica.App.repository.SuportePsicologicoRepository;
import CombateAviolenciaDomestica.App.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private DenunciaRepository denunciaRepository;

    @Autowired
    private SuportePsicologicoRepository suportePsicologicoRepository;

    @GetMapping("/admin/dashboard")
    public String dashboard(Model model) {

        long totalUsuarios = usuarioRepository.count();
        long totalDenuncias = denunciaRepository.count();
        long totalPsicologas = suportePsicologicoRepository.countByNomePsicologaIsNotNull();
        long totalOngs = suportePsicologicoRepository.countByNomeOngIsNotNull();
        long totalSuportes = suportePsicologicoRepository.count();

        long totalBase = totalUsuarios + totalDenuncias;

        int porcentagemUsoSistema = totalBase > 0 ? (int) ((totalUsuarios * 100) / totalBase) : 0;
        int porcentagemDenuncias = totalBase > 0 ? (int) ((totalDenuncias * 100) / totalBase) : 0;

        model.addAttribute("totalUsuarios", totalUsuarios);
        model.addAttribute("totalDenuncias", totalDenuncias);
        model.addAttribute("totalPsicologas", totalPsicologas);
        model.addAttribute("totalOngs", totalOngs);
        model.addAttribute("totalSuportes", totalSuportes);
        model.addAttribute("porcentagemUsoSistema", porcentagemUsoSistema);
        model.addAttribute("porcentagemDenuncias", porcentagemDenuncias);

        return "admin/dashboard";
    }
}