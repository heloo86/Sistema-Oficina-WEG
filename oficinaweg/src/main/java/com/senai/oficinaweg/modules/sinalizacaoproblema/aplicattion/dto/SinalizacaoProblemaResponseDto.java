package com.senai.oficinaweg.modules.sinalizacaoproblema.aplicattion.dto;

public record SinalizacaoProblemaResponseDto(
        int id,
        String autor,
        String equipamentoDefeituoso,
        String descricao
) {
}
