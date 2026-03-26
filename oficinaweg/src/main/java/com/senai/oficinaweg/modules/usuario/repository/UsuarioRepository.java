package com.senai.oficinaweg.modules.usuario.repository;

import com.senai.oficinaweg.modules.usuario.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {

    Usuario save(Usuario Usuario);
    List<Usuario> findAll();
    Optional<Usuario> findById(int Id);
    void deleteById(int id);
    
    boolean existById(int id);
    boolean isUsuarioProfessor(int id);
}
