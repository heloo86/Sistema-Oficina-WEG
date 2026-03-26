package com.senai.oficinaweg.modules.usuario.service;

import com.senai.oficinaweg.modules.usuario.model.Usuario;
import com.senai.oficinaweg.modules.usuario.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public boolean isUsuarioProfessor (int id ) {
        return repository.isUsuarioProfessor(id);
    }
}
