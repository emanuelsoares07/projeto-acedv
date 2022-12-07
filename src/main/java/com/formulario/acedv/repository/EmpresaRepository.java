package com.formulario.acedv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<com.formulario.acedv.orm.EmpresaOrm, Long> {
}
