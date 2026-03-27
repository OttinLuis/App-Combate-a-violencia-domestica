package CombateAviolenciaDomestica.App.service;

import CombateAviolenciaDomestica.App.dto.AgenteResponse;
import org.springframework.stereotype.Service;

@Service
public class AgenteService {

    public AgenteResponse processar(String mensagem) {
        String texto = mensagem.toLowerCase();

        if (texto.contains("perigo") || texto.contains("socorro") || texto.contains("agora")) {
            return new AgenteResponse(
                    "Se você estiver em perigo imediato, procure ajuda urgente. Vou te levar para registrar uma denúncia agora.",
                    "/denunciar"
            );
        }

        if (texto.contains("denuncia") || texto.contains("denúncia")
                || texto.contains("agressao") || texto.contains("agressão")) {
            return new AgenteResponse(
                    "Vou te ajudar a registrar uma denúncia.",
                    "/denunciar"
            );
        }

        if (texto.contains("psicologo") || texto.contains("psicólogo")
                || texto.contains("suporte") || texto.contains("ajuda emocional")) {
            return new AgenteResponse(
                    "Vou te encaminhar para o suporte psicológico.",
                    "/suporte/psicologico"
            );
        }

        if (texto.contains("cadastrar") || texto.contains("cadastro")
                || texto.contains("criar conta")) {
            return new AgenteResponse(
                    "Vou te levar para a tela de cadastro.",
                    "/usuarios/cadastro"
            );
        }

        if (texto.contains("login") || texto.contains("entrar")
                || texto.contains("acessar")) {
            return new AgenteResponse(
                    "Vou te levar para o login.",
                    "/usuarios/login"
            );
        }

        return new AgenteResponse(
                "Posso te ajudar com denúncia, suporte psicológico, cadastro ou login. Me diga o que você precisa.",
                null
        );
    }
}