package com.senai.oficinaweg.modules.ordemdeservico.aplication.mapper;

import com.senai.oficinaweg.modules.ordemdeservico.aplication.dto.OrdemServicoRequestDto;
import com.senai.oficinaweg.modules.ordemdeservico.aplication.dto.OrdemServicoResponseDto;
import com.senai.oficinaweg.modules.ordemdeservico.domain.model.OrdemDeServico;
import com.senai.oficinaweg.modules.ordemdeservico.domain.model.StatusOs;
import com.senai.oficinaweg.modules.usuario.application.UsuarioMapper;
import com.senai.oficinaweg.modules.usuario.domain.model.Usuario;
import com.senai.oficinaweg.modules.usuario.domain.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrdemServicoMapper {

    private final UsuarioService usuarioService;

    public OrdemDeServico toEntity(OrdemServicoRequestDto request) {
        return new OrdemDeServico(
                request.equipamento(),
                request.defeitoRelatado(),
                StatusOs.valueOf(request.statusOs()),
                request.materiaisUsados(),
                request.conclusaoTecnica(),
                usuarioService.findById(request.professorResponsavel()),
                request.alunosEscalados().stream().map(usuarioService :: findById).toList()
        );
    }

    public OrdemServicoResponseDto toResponse(OrdemDeServico ordemDeServico) {
        return new OrdemServicoResponseDto(
                ordemDeServico.getId(),
                ordemDeServico.getEquipamento(),
                ordemDeServico.getDefeitoRelatado(),
                ordemDeServico.getStatusOs().toString(),
                ordemDeServico.getMateriaisUsados(),
                ordemDeServico.getConclusaoTecnica(),
                ordemDeServico.getProfessorResponsavel().getId(),
                ordemDeServico.getAlunosEscalados()
                        .stream()
                        .map(Usuario::getId)
                        .toList()
        );
    }
}
