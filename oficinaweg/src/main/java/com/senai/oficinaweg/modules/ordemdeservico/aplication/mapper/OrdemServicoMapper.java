package com.senai.oficinaweg.modules.ordemdeservico.aplication.mapper;

import com.senai.oficinaweg.modules.ordemdeservico.aplication.dto.OrdemServicoRequestDto;
import com.senai.oficinaweg.modules.ordemdeservico.aplication.dto.OrdemServicoResponseDto;
import com.senai.oficinaweg.modules.ordemdeservico.domain.model.OrdemDeServico;
import org.springframework.stereotype.Component;

@Component
public class OrdemServicoMapper {
    public OrdemDeServico toEntity(OrdemServicoRequestDto request) {
        return new OrdemDeServico(
                request.equipamento(),
                request.defeitoRelatado(),
                request.statusOs(),
                request.materiaisUsados(),
                request.conclusaoTecnica(),
                request.professorResponsavel(),
                request.alunosEscalados()
        );
    }

    public OrdemServicoResponseDto toResponse(OrdemDeServico ordemDeServico) {
        return new OrdemServicoResponseDto(
                ordemDeServico.getId(),
                ordemDeServico.getEquipamento(),
                ordemDeServico.getDefeitoRelatado(),
                ordemDeServico.getStatusOs(),
                ordemDeServico.getMateriaisUsados(),
                ordemDeServico.getConclusaoTecnica(),
                ordemDeServico.getProfessorResponsavel(),
                ordemDeServico.getAlunosEscalados()
        );
    }
}
