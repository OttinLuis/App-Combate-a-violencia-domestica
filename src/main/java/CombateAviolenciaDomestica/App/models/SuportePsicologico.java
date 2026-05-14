package CombateAviolenciaDomestica.App.models;

import jakarta.persistence.*;

@Entity
@Table(name = "suporte_psicologico")
public class SuportePsicologico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_psicologa", nullable = false, length = 150)
    private String nomePsicologa;

    @Column(name = "contato_psicologa", length = 15)
    private String contatoPsicologa;

    @Column(name = "email_psicologa", unique = true, length = 150)
    private String emailPsicologa;

    @Column(name = "nome_ong", length = 150)
    private String nomeOng;

    @Column(name = "rua_ong", length = 200)
    private String ruaOng;

    @Column(name = "contato_ong", length = 15)
    private String contatoOng;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "rede_de_apoio_id")
    private RedeDeApoio rede_de_apoio;

    public String getNomePsicologa() {
        return nomePsicologa;
    }

    public void setNomePsicologa(String nomePsicologa) {
        this.nomePsicologa = nomePsicologa;
    }

    public String getContatoPsicologa() {
        return contatoPsicologa;
    }

    public void setContatoPsicologa(String contatoPsicologa) {
        this.contatoPsicologa = contatoPsicologa;
    }

    public String getEmailPsicologa() {
        return emailPsicologa;
    }

    public void setEmailPsicologa(String emailPsicologa) {
        this.emailPsicologa = emailPsicologa;
    }

    public String getNomeOng() {
        return nomeOng;
    }

    public void setNomeOng(String nomeOng) {
        this.nomeOng = nomeOng;
    }

    public String getRuaOng() {
        return ruaOng;
    }

    public void setRuaOng(String ruaOng) {
        this.ruaOng = ruaOng;
    }

    public String getContatoOng() {
        return contatoOng;
    }

    public void setContatoOng(String contatoOng) {
        this.contatoOng = contatoOng;
    }
}
