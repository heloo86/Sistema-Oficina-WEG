package com.senai.oficinaweg.modules.turma.application;

import com.senai.oficinaweg.modules.turma.application.dto.TurmaResponseDto;
import com.senai.oficinaweg.modules.turma.domain.model.Turma;
import com.senai.oficinaweg.modules.usuario.application.UsuarioMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TurmaMapper {

    private final UsuarioMapper usuarioMapper;

    public TurmaResponseDto toResponse(Turma turma){
        return new TurmaResponseDto(
                turma.getId(),
                turma.getNome(),
                turma.getAlunos().stream()
                        .map(usuarioMapper :: toResponse)
                        .toList()
        );
    }
}
