package com.formulario.acedv.controller;

import com.formulario.acedv.orm.EmpresaEntity;
import com.formulario.acedv.orm.dto.EmpresaDTO;
import com.formulario.acedv.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")

public class EmpresaController {


    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public List<EmpresaEntity> findAll() {return empresaService.findAll();}

    @GetMapping("/{id}")
    public EmpresaEntity findByid(@PathVariable Long id){return empresaService.findByid(id);}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmpresaEntity save(@RequestBody EmpresaDTO dto){
        return empresaService.save(dto);
    }

    @PutMapping("/{id}")
    public EmpresaEntity updateEmpresa(@RequestBody EmpresaDTO dto, @PathVariable Long id ) {
        EmpresaEntity empresaEntity = empresaService.findByid(id);
        return empresaService.update(empresaEntity, dto);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        empresaService.delete(id);
    }

}
