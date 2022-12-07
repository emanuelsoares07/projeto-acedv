package com.formulario.acedv.orm;


import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1)
public class UsuarioOrm {

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

}
