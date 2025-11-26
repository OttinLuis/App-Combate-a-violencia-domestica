package CombateAviolenciaDomestica.App.controller;

import CombateAviolenciaDomestica.App.models.Usuario;
import CombateAviolenciaDomestica.App.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioController(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "login";
    }

    @PostMapping("/login")
    public String fazerLogin(@ModelAttribute Usuario usuario,
                             RedirectAttributes redirectAttributes) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findByEmail(usuario.getEmail());

        if (usuarioExistente.isPresent()) {
            Usuario user = usuarioExistente.get();
            if (passwordEncoder.matches(usuario.getSenha(), user.getSenha())) {
                redirectAttributes.addFlashAttribute("mensagem", "Login bem-sucedido!");
                return "redirect:/usuarios/home";
            }
        }

        redirectAttributes.addFlashAttribute("erro", "E-mail ou senha incorretos!");
        return "redirect:/usuarios/login";
    }

    @GetMapping("/cadastro")
    public String mostrarFormularioCadastro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "cadastro";
    }

    @PostMapping("/salvar")
    public String salvarUsuario(@ModelAttribute Usuario usuario, RedirectAttributes redirectAttributes) {
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        usuarioRepository.save(usuario);

        redirectAttributes.addFlashAttribute("mensagem", "Usuário cadastrado com sucesso!");
        return "redirect:/usuarios/login";
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "home";
    }
}
