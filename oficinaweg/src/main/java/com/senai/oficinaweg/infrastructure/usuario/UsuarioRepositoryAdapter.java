package com.senai.oficinaweg.infrastructure.usuario;

import com.senai.oficinaweg.modules.usuario.domain.model.TipoUsuario;
import com.senai.oficinaweg.modules.usuario.domain.model.Usuario;
import com.senai.oficinaweg.modules.usuario.domain.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepository {

    private final UsuarioJpaRepository jpaRepository;

    @Override
    public Usuario save(Usuario usuario) {
        return jpaRepository.save(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(int id) {
        return jpaRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public boolean existById(int id) {
        return jpaRepository.existsById(id);
    }

    @Override
    public boolean isUsuarioProfessor(int id) {
        Usuario usuario = jpaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        if (usuario.getTipoUsuario() == TipoUsuario.PROFESSOR){
            return true;
        }
        return false;
    }

    @Override
    public boolean isUsuarioAluno(int id) {
        Usuario usuario = jpaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        if (usuario.getTipoUsuario() == TipoUsuario.ALUNO){
            return true;
        }
        return false;
    }
}
