package CombateAviolenciaDomestica.App.dto;

public class AgenteResponse {

    private String resposta;
    private String rota;

    public AgenteResponse(String resposta, String rota) {
        this.resposta = resposta;
        this.rota = rota;
    }

    public String getResposta() {
        return resposta;
    }

    public String getRota() {
        return rota;
    }
}