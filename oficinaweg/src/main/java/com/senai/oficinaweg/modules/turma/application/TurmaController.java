package com.senai.oficinaweg.modules.turma.application;

import com.senai.oficinaweg.modules.turma.application.dto.TurmaResponseDto;
import com.senai.oficinaweg.modules.turma.domain.service.TurmaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/turmas")
public class TurmaController {

    private final TurmaService service;
    private final TurmaMapper mapper;

    @GetMapping
    public ResponseEntity<List<TurmaResponseDto>> listarTurmaEAlunos (){
        var turma = service.listarTurmaEALunos()
                .stream()
                .map(mapper ::toResponse)
                .toList();
        return ResponseEntity.ok(turma);
    }
}
