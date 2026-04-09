package com.senai.oficinaweg.modules.usuario.application;

import com.senai.oficinaweg.modules.usuario.application.dto.UsuarioRequestDto;
import com.senai.oficinaweg.modules.usuario.application.dto.UsuarioResponseDto;
import com.senai.oficinaweg.modules.usuario.domain.model.Usuario;
import com.senai.oficinaweg.modules.usuario.domain.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@AllArgsConstructor
public class UsuarioControler {

    private final UsuarioService service;
    private final UsuarioMapper mapper;

    @PostMapping
    public ResponseEntity<UsuarioResponseDto> adicionarUsusario (
            @RequestBody UsuarioRequestDto requestDto){

        var usuario = mapper.toEntity(requestDto);
        service.save(usuario);
        return ResponseEntity.ok(mapper.toResponse(usuario));

    }
}
