package com.formulario.acedv.orm;


import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1)
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(name = "nome", nullable = false, length = 500)
    private String dsnome;

    @Column(name="email")
    private String dsemail;

    @Column(name = "funcao")
    private String dsfuncao;

    @Column(name = "endereco")
    private String dsendereco;

    @Column(name = "situacao")
    private Boolean fgsituacao;

    @Column(name = "cargo")
    private String dscargo;

    @Column(name = "tempoprofissao")
    private String dstempoprofissao;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "genero")
    private String genero;

    @Column(name = "graduacao")
    private String graduacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
