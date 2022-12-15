package com.formulario.acedv.orm;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="empresas")
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id", nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "nomefantasia", nullable = false, length = 500)
    private String dsnomefantasia;

    @Column(name = "nomerazaosocial", nullable = false, length = 500)
    private String dsnomerazaosocial;

    @Column(name="datafundacao")
    private Date datafundacao;

    @Column(name = "cep")
    private Number cep;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "endereco")
    private String dsendereco;

    @Column(name = "numeroend")
    private Number numeroend;

    @Column (name = "representante")
    private String dsrepresentante;

    @Column (name = "nucleo")
    private Boolean fgnucleo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDsnomefantasia() {
        return dsnomefantasia;
    }

    public void setDsnomefantasia(String dsnomefantasia) {
        this.dsnomefantasia = dsnomefantasia;
    }

    public String getDsnomerazaosocial() {
        return dsnomerazaosocial;
    }

    public void setDsnomerazaosocial(String dsnomerazaosocial) {
        this.dsnomerazaosocial = dsnomerazaosocial;
    }

    public Date getDatafundacao() {
        return datafundacao;
    }

    public void setDatafundacao(Date datafundacao) {
        this.datafundacao = datafundacao;
    }

    public Number getCep() {
        return cep;
    }

    public void setCep(Number cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDsendereco() {
        return dsendereco;
    }

    public void setDsendereco(String dsendereco) {
        this.dsendereco = dsendereco;
    }

    public Number getNumeroend() {
        return numeroend;
    }

    public void setNumeroend(Number numeroend) {
        this.numeroend = numeroend;
    }

    public String getDsrepresentante() {
        return dsrepresentante;
    }

    public void setDsrepresentante(String dsrepresentante) {
        this.dsrepresentante = dsrepresentante;
    }

    public Boolean getFgnucleo() {
        return fgnucleo;
    }

    public void setFgnucleo(Boolean fgnucleo) {
        this.fgnucleo = fgnucleo;
    }

}

