package com.senai.oficinaweg.modules.ordemdeservico.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table
public class OrdemDeServico {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String equipamento;

    @Column
    private String defeitoRelatado;

    @Column
    private StatusOs statusOs;

    @Column
    private String materiaisUsados;

    @Column
    private String conclusaoTecnica;

    @OneToOne
    @JoinColumn(name = "Usuario")
    private int professorResponsavel;

    @OneToMany
    @JoinColumn(name = "Usuarios")
    private List<Integer> alunosEscalados;
}
