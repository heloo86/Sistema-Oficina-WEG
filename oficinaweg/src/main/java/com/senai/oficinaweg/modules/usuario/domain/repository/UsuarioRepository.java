package com.senai.oficinaweg.modules.usuario.domain.repository;

import com.senai.oficinaweg.modules.usuario.domain.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UsuarioRepository {

    Usuario save(Usuario Usuario);
    List<Usuario> findAll();
    Optional<Usuario> findById(int Id);
    void deleteById(int id);
    
    boolean existById(int id);
    boolean isUsuarioProfessor(int id);
    boolean isUsuarioAluno(int id);
}
