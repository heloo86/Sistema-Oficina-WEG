package com.senai.oficinaweg.modules.problemas.aplicattion.dto;

public record SinalizacaoProblemaResponseDto(
        int id,
        String autor,
        String equipamentoDefeituoso,
        String descricao
) {
}
