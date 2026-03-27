package CombateAviolenciaDomestica.App.controller;

import CombateAviolenciaDomestica.App.dto.AgenteResponse;
import CombateAviolenciaDomestica.App.dto.MensagemRequest;
import CombateAviolenciaDomestica.App.service.AgenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agente")
public class AgenteController {

    @Autowired
    private AgenteService agenteService;

    @PostMapping
    public AgenteResponse conversar(@RequestBody MensagemRequest request) {
        return agenteService.processar(request.getMensagem());
    }
}