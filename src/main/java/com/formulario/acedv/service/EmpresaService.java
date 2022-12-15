package com.formulario.acedv.service;
import com.formulario.acedv.orm.dto.EmpresaDTO;
import com.formulario.acedv.repository.EmpresaRepository;
import com.formulario.acedv.orm.EmpresaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public List<EmpresaEntity> findAll() {return empresaRepository.findAll();}

    public EmpresaEntity findByid(Long id) {
        Optional<EmpresaEntity> entity = empresaRepository.findById(id);

        if (entity.isPresent()){
            return entity.get();
        }
        throw new RuntimeException();
    }

    public EmpresaEntity save(EmpresaDTO dto) {

        EmpresaEntity entity = new EmpresaEntity();
        entity.setCnpj(dto.getCnpj());
        entity.setDsnomefantasia(dto.getDsnomefantasia());
        entity.setDsnomerazaosocial(dto.getDsnomerazaosocial());
        entity.setDatafundacao(dto.getDatafundacao());
        entity.setCep(dto.getCep());
        entity.setCidade(dto.getCidade());
        entity.setDsendereco(dto.getDsendereco());
        entity.setNumeroend(dto.getNumeroend());
        entity.setDsrepresentante(dto.getDsrepresentante());
        entity.setFgnucleo(dto.getFgnucleo());

        return empresaRepository.save(entity);
    }

    public EmpresaEntity update (EmpresaEntity entity, EmpresaDTO dto) {

        entity.setCnpj(dto.getCnpj());
        entity.setDsnomefantasia(dto.getDsnomefantasia());
        entity.setDsnomerazaosocial(dto.getDsnomerazaosocial());
        entity.setDatafundacao(dto.getDatafundacao());
        entity.setCep(dto.getCep());
        entity.setCidade(dto.getCidade());
        entity.setDsendereco(dto.getDsendereco());
        entity.setNumeroend(dto.getNumeroend());
        entity.setDsrepresentante(dto.getDsrepresentante());
        entity.setFgnucleo(dto.getFgnucleo());

        return empresaRepository.save(entity);
    }
    public void delete(Long id) {
    }
}
