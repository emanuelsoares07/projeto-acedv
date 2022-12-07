package com.formulario.acedv.orm;

import jakarta.persistence.*;

@Entity
@Table(name="empresas")
public class EmpresaOrm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id", nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(name = "cnpj")
    private Boolean cnpj;

    @Column(name = "nomefantasia", nullable = false, length = 500)
    private String dsnomefantasia;

    @Column(name = "nomerazaosocial", nullable = false, length = 500)
    private String dsnomerazaosocial;

    @Column(name="datafundacao")
    private String datafundacao;

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

}

