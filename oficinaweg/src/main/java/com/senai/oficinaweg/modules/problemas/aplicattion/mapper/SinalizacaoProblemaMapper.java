package com.senai.oficinaweg.modules.problemas.aplicattion.mapper;

import com.senai.oficinaweg.modules.problemas.aplicattion.dto.SinalizacaoProblemaRequestDto;
import com.senai.oficinaweg.modules.problemas.aplicattion.dto.SinalizacaoProblemaResponseDto;
import com.senai.oficinaweg.modules.problemas.domain.model.SinalizacaoProblema;
import org.springframework.stereotype.Component;

@Component
public class SinalizacaoProblemaMapper {

    public SinalizacaoProblema toEntity(SinalizacaoProblemaRequestDto request) {
        return new SinalizacaoProblema(
                request.autor(),
                request.equipamentoDefeituoso(),
                request.descricao()
        );
    }

    public SinalizacaoProblemaResponseDto toResponse( SinalizacaoProblema problema){
        return new SinalizacaoProblemaResponseDto(
                problema.getId(),
                problema.getAutor(),
                problema.getEquipamentoDefeituoso(),
                problema.getDescricao()
        );
    }
}
