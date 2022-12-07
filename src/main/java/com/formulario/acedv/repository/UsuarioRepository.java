package com.formulario.acedv.repository;

import com.formulario.acedv.orm.UsuarioOrm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioOrm, Long> {
}
