package com.formulario.acedv.controller;

import com.formulario.acedv.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
}
