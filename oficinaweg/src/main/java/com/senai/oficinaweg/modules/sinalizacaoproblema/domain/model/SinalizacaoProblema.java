package com.senai.oficinaweg.modules.sinalizacaoproblema.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table
public class SinalizacaoProblema {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String autor;

    @Column
    private String equipamentoDefeituoso;

    @Column
    private String descricao;

    public SinalizacaoProblema(String autor, String equipamentoDefeituoso, String descricao) {
        this.autor = autor;
        this.equipamentoDefeituoso = equipamentoDefeituoso;
        this.descricao = descricao;
    }
}
