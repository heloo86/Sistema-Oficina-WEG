package com.senai.oficinaweg.modules.ordemdeservico.aplication.dto;

import com.senai.oficinaweg.modules.ordemdeservico.domain.model.StatusOs;

import java.util.List;

public record OrdemServicoRequestDto(
        String equipamento,
        String defeitoRelatado,
        StatusOs statusOs,
        String materiaisUsados,
        String conclusaoTecnica,
        int professorResponsavel,
        List<Integer> alunosEscalados
) {
}
