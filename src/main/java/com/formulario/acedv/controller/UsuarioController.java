package com.formulario.acedv.controller;

import com.formulario.acedv.orm.UsuarioEntity;
import com.formulario.acedv.orm.dto.UsuarioDTO;
import com.formulario.acedv.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @GetMapping
    public List<UsuarioEntity> findAll(){
        return usuarioService.findAll();
    }
    @GetMapping("/{id}")
    public UsuarioEntity findById(@PathVariable Long id){
        return usuarioService.findById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioEntity save(@RequestBody  UsuarioDTO dto){
        return usuarioService.save(dto);
    }
    @PutMapping("/{id}")
    public UsuarioEntity updateUsuario(@RequestBody UsuarioDTO dto, @PathVariable Long id ){
        UsuarioEntity usuarioEntity = usuarioService.findById(id);
        return usuarioService.update(usuarioEntity, dto);
    }
    @DeleteMapping("/{id}")
    public void  delete(@PathVariable Long id){
        usuarioService.delete(id);
    }

}
