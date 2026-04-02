package com.senai.oficinaweg.modules.turma.application.dto;

import com.senai.oficinaweg.modules.usuario.application.dto.UsuarioResponseDto;

import java.util.List;

public record TurmaResponseDto(
        int id,
        String nome,
        List<UsuarioResponseDto> alunos
) {
}
