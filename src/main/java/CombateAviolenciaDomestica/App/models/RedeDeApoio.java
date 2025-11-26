package CombateAviolenciaDomestica.App.models;

import jakarta.persistence.*;

@Entity
@Table(name = "rede_de_apoio")
public class RedeDeApoio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contato_da_ong", nullable = false)
    private String contatoDaOng;

    @Column(name = "nome_da_ong", nullable = false)
    private String nomeDaOng;


    @Column(nullable = false)
    private String rua;


    public RedeDeApoio() {
    }

    public Long getId() {
        return id;
    }

    public String getContatoDaOng() {
        return contatoDaOng;
    }

    public void setContatoDaOng(String contatoDaOng) {
        this.contatoDaOng = contatoDaOng;
    }

    public String getNomeDaOng() {
        return nomeDaOng;
    }

    public void setNomeDaOng(String nomeDaOng) {
        this.nomeDaOng = nomeDaOng;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
