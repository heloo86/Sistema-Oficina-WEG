package com.senai.oficinaweg.modules.ordemdeservico.aplication.dto;

import com.senai.oficinaweg.modules.ordemdeservico.domain.model.StatusOs;

import java.util.List;

public record OrdemServicoResponseDto(

        int id,
        String equipamento,
        String defeitoRelatado,
        String statusOs,
        String materiaisUsados,
        String conclusaoTecnica,
        int professorResponsavel,
        List<Integer> alunosEscalados

) {
}
