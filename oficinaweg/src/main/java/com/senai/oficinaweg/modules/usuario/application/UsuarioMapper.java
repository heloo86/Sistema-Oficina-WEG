package com.senai.oficinaweg.modules.usuario.application;

import com.senai.oficinaweg.modules.usuario.application.dto.UsuarioResponseDto;
import com.senai.oficinaweg.modules.usuario.domain.model.Usuario;

public class UsuarioMapper {

    public UsuarioResponseDto toResponse(Usuario usuario) {
        return new UsuarioResponseDto(
                usuario.getId(),
                usuario.getNome(),
                usuario.getTipoUsuario().toString()
        );
    }
}
