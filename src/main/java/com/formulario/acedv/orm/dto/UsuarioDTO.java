package com.formulario.acedv.orm.dto;

public class UsuarioDTO {

    private String dsnome;

    private String dsemail;

    private String dsfuncao;

    private String dsendereco;

    private Boolean fgsituacao;

    private String dscargo;

    private String dstempoprofissao;

    private String cidade;

    private String genero;

    private String graduacao;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String dsnome, String dsemail, String dsfuncao, String dsendereco,
                      Boolean fgsituacao, String dscargo, String dstempoprofissao,
                      String cidade, String genero, String graduacao) {
        this.dsnome = dsnome;
        this.dsemail = dsemail;
        this.dsfuncao = dsfuncao;
        this.dsendereco = dsendereco;
        this.fgsituacao = fgsituacao;
        this.dscargo = dscargo;
        this.dstempoprofissao = dstempoprofissao;
        this.cidade = cidade;
        this.genero = genero;
        this.graduacao = graduacao;
    }

    public String getDsnome() {
        return dsnome;
    }

    public void setDsnome(String dsnome) {
        this.dsnome = dsnome;
    }

    public String getDsemail() {
        return dsemail;
    }

    public void setDsemail(String dsemail) {
        this.dsemail = dsemail;
    }

    public String getDsfuncao() {
        return dsfuncao;
    }

    public void setDsfuncao(String dsfuncao) {
        this.dsfuncao = dsfuncao;
    }

    public String getDsendereco() {
        return dsendereco;
    }

    public void setDsendereco(String dsendereco) {
        this.dsendereco = dsendereco;
    }

    public Boolean getFgsituacao() {
        return fgsituacao;
    }

    public void setFgsituacao(Boolean fgsituacao) {
        this.fgsituacao = fgsituacao;
    }

    public String getDscargo() {
        return dscargo;
    }

    public void setDscargo(String dscargo) {
        this.dscargo = dscargo;
    }

    public String getDstempoprofissao() {
        return dstempoprofissao;
    }

    public void setDstempoprofissao(String dstempoprofissao) {
        this.dstempoprofissao = dstempoprofissao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
}
