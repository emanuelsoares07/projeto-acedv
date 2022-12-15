package com.formulario.acedv.service;

import com.formulario.acedv.orm.UsuarioEntity;
import com.formulario.acedv.orm.dto.UsuarioDTO;
import com.formulario.acedv.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    public  List<UsuarioEntity> findAll() {
        return usuarioRepository.findAll();
    }

    public UsuarioEntity findById(Long id) {
        Optional<UsuarioEntity> entity = usuarioRepository.findById(id);

        if(entity.isPresent()){
            return entity.get();
        }
        throw new RuntimeException();
    }

    public UsuarioEntity save(UsuarioDTO dto) {

        UsuarioEntity entity = new UsuarioEntity();
        entity.setDsnome(dto.getDsnome());
        entity.setDsemail(dto.getDsemail());
        entity.setDsfuncao(dto.getDsfuncao());
        entity.setDsendereco(dto.getDsendereco());
        entity.setFgsituacao(dto.getFgsituacao());
        entity.setDscargo(dto.getDscargo());
        entity.setDstempoprofissao(dto.getDstempoprofissao());
        entity.setCidade(dto.getCidade());
        entity.setGenero(dto.getGenero());
        entity.setGraduacao(dto.getGraduacao());


        return usuarioRepository.save(entity);
    }

    public UsuarioEntity update(UsuarioEntity entity, UsuarioDTO dto) {

        entity.setDsnome(dto.getDsnome());
        entity.setDsemail(dto.getDsemail());
        entity.setDsfuncao(dto.getDsfuncao());
        entity.setDsendereco(dto.getDsendereco());
        entity.setFgsituacao(dto.getFgsituacao());
        entity.setDscargo(dto.getDscargo());
        entity.setDstempoprofissao(dto.getDstempoprofissao());
        entity.setCidade(dto.getCidade());
        entity.setGenero(dto.getGenero());
        entity.setGraduacao(dto.getGraduacao());
        return usuarioRepository.save(entity);

    }

    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }
}
