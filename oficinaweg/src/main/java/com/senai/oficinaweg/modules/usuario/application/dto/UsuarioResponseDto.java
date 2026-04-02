package com.senai.oficinaweg.modules.usuario.application.dto;

import com.senai.oficinaweg.modules.usuario.domain.model.TipoUsuario;

public record UsuarioResponseDto(
        int id,
        String nome,
        String tipoUsuario
) {
}
