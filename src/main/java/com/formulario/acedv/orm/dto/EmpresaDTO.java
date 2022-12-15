package com.formulario.acedv.orm.dto;

import java.util.Date;

public class EmpresaDTO {

    private String cnpj;

    private String dsnomefantasia;

    private String dsnomerazaosocial;

    private Date datafundacao;

    private Number cep;

    private String cidade;

    private String dsendereco;

    private Number numeroend;

    private String dsrepresentante;

    private Boolean fgnucleo;

    public EmpresaDTO() {
    }

    public EmpresaDTO(String cnpj, String dsnomefantasia, String dsnomerazaosocial, Date datafundacao,
                      Number cep, String cidade,String dsendereco,
                      Number numeroend, String dsrepresentante, Boolean fgnucleo) {
        this.cnpj = cnpj;
        this.dsnomefantasia = dsnomefantasia;
        this.dsnomerazaosocial = dsnomerazaosocial;
        this.datafundacao = datafundacao;
        this.cep = cep;
        this.cidade = cidade;
        this.dsendereco = dsendereco;
        this.numeroend = numeroend;
        this.dsrepresentante = dsrepresentante;
        this.fgnucleo = fgnucleo;
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
