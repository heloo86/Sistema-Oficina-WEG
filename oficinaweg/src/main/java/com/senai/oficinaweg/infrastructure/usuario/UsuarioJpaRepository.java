package com.senai.oficinaweg.infrastructure.usuario;

import com.senai.oficinaweg.modules.usuario.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioJpaRepository extends JpaRepository<Usuario, Integer> {

}