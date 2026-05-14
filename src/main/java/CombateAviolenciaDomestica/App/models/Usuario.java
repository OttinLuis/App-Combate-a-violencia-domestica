package CombateAviolenciaDomestica.App.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, name = "cpf", length = 11)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String rg;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(name = "data_nascimento", nullable = false)
    private String dataNascimento;

    private Boolean ativo;

    @Column(name = "cep", length = 8)
    private String cep;

    private String numero;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String rua;

    private String municipio;
    private String estado;
    private String complemento;

    @Column(name = "contato", length = 10, nullable = false)
    private String contato;
    @Column(name = "contato_confianca", length = 10, nullable = false)
    private String contatoConfianca;

    private String observacoes;

    @OneToMany(mappedBy = "usuario")
    private List<DenunciarCaso> denunciarCasos;

    @OneToMany(mappedBy = "usuario")
    private List<RedeDeApoio> redeDeApoios;

    @OneToMany(mappedBy = "usuario")
    private List<SuportePsicologico> suportePsicologicos;

    public Usuario() {}

    public Usuario(String cpf, String nome, String rg, String email, String senha,
                   String dataNascimento, Boolean ativo, String cep, String numero,
                   String bairro, String rua, String municipio, String estado, String complemento,
                   String contato, String contatoConfianca, String observacoes) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.ativo = ativo;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.rua = rua;
        this.municipio = municipio;
        this.estado = estado;
        this.complemento = complemento;
        this.contato = contato;
        this.contatoConfianca = contatoConfianca;
        this.observacoes = observacoes;
    }


    public Long getId() { return id; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }
    public String getRua() {return rua;}
    public void setRua(String rua) {this.rua = rua;}
    public String getMunicipio() { return municipio; }
    public void setMunicipio(String municipio) { this.municipio = municipio; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }
    public String getContatoConfianca() { return contatoConfianca; }
    public void setContatoConfianca(String contatoConfianca) { this.contatoConfianca = contatoConfianca; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }



}

