package com.senai.oficinaweg.modules.usuario.application;

import com.senai.oficinaweg.modules.usuario.application.dto.UsuarioRequestDto;
import com.senai.oficinaweg.modules.usuario.application.dto.UsuarioResponseDto;
import com.senai.oficinaweg.modules.usuario.domain.model.TipoUsuario;
import com.senai.oficinaweg.modules.usuario.domain.model.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public UsuarioResponseDto toResponse(Usuario usuario) {
        return new UsuarioResponseDto(
                usuario.getId(),
                usuario.getNome(),
                usuario.getTipoUsuario().toString()
        );
    }

    public Usuario toEntity (UsuarioRequestDto requestDto){
        return new Usuario(
                requestDto.nome(),
                TipoUsuario.valueOf(requestDto.tipoUsuario())
        );
    }


}
