package com.senai.oficinaweg.modules.sinalizacaoproblema.aplicattion.dto;

public record SinalizacaoProblemaRequestDto(
        String autor,
        String equipamentoDefeituoso,
        String descricao
) {
}
