package com.senai.oficinaweg.modules.ordemdeservico.aplication.controller;

import com.senai.oficinaweg.modules.ordemdeservico.aplication.dto.OrdemServicoRequestDto;
import com.senai.oficinaweg.modules.ordemdeservico.aplication.dto.OrdemServicoResponseDto;
import com.senai.oficinaweg.modules.ordemdeservico.aplication.mapper.OrdemServicoMapper;
import com.senai.oficinaweg.modules.ordemdeservico.domain.model.OrdemDeServico;
import com.senai.oficinaweg.modules.ordemdeservico.domain.service.OrdemServicoService;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping("/ordemservicos")
public class OrdemServicoController {

    private final OrdemServicoService service;
    private final OrdemServicoMapper mapper;

    @PostMapping("/{usuarioId}")
    public ResponseEntity<OrdemServicoResponseDto> abrirOrdemServico (
            @RequestBody OrdemServicoRequestDto request,
            @PathVariable int usuarioId){
        OrdemDeServico ordemDeServico = mapper.toEntity(request);
        service.registrarOrdemServico(ordemDeServico, usuarioId);

        return ResponseEntity.ok(mapper.toResponse(ordemDeServico));
    }


}
