package CombateAviolenciaDomestica.App.models;

import jakarta.persistence.*;

@Entity
@Table(name = "denunciar_caso")
public class DenunciarCaso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String relato;

    @Column(name = "rua_incidente")
    private String rua;

    @Column(name = "numero_casa_incidente")
    private String numero;

    @Column(name = "bairro_incidente")
    private String bairro;

    private String cep;

    private String estado;

    private String municipio;

    public DenunciarCaso() {}

    public Long getId() { return id; }

    public String getRelato() { return relato; }
    public void setRelato(String relato) { this.relato = relato; }

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getMunicipio() { return municipio; }
    public void setMunicipio(String municipio) { this.municipio = municipio; }
}
