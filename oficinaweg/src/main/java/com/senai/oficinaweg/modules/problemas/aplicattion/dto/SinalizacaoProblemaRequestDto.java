package com.senai.oficinaweg.modules.problemas.aplicattion.dto;

public record SinalizacaoProblemaRequestDto(
        String autor,
        String equipamentoDefeituoso,
        String descricao
) {
}
