package com.senai.oficinaweg.modules.sinalizacaoproblema.aplicattion.controller;


import com.senai.oficinaweg.modules.sinalizacaoproblema.aplicattion.dto.SinalizacaoProblemaRequestDto;
import com.senai.oficinaweg.modules.sinalizacaoproblema.aplicattion.dto.SinalizacaoProblemaResponseDto;
import com.senai.oficinaweg.modules.sinalizacaoproblema.aplicattion.mapper.SinalizacaoProblemaMapper;
import com.senai.oficinaweg.modules.sinalizacaoproblema.domain.model.SinalizacaoProblema;
import com.senai.oficinaweg.modules.sinalizacaoproblema.domain.service.ProblemaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/problemas")
@AllArgsConstructor
public class SinalizacaoProblemaController {

    private final ProblemaService service;
    private final SinalizacaoProblemaMapper mapper;

    @PostMapping
    public ResponseEntity<SinalizacaoProblemaResponseDto> sinalizarProblema (
            @RequestBody SinalizacaoProblemaRequestDto request
    ){
        SinalizacaoProblema problema = mapper.toEntity(request);
        service.sinalizarProblema(problema);

        return ResponseEntity.ok(mapper.toResponse(problema));
    }
}
