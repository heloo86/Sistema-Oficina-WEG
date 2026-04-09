package com.senai.oficinaweg.modules.usuario.domain.service;

import com.senai.oficinaweg.modules.usuario.application.dto.UsuarioResponseDto;
import com.senai.oficinaweg.modules.usuario.domain.model.Usuario;
import com.senai.oficinaweg.modules.usuario.domain.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public boolean isUsuarioProfessor (int id ) {
        return repository.isUsuarioProfessor(id);
    }

    public List<Usuario> listarAlunos () {
        List<Usuario> usuarios = repository.findAll();
        List<Usuario> alunos = usuarios.stream()
                .filter(usuario -> repository.isUsuarioAluno(usuario.getId()))
                .toList();
        return alunos;
    }

    public Usuario findById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
    }

    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }
}
