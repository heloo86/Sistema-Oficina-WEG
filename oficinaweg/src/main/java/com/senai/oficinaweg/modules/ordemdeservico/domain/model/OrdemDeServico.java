package com.senai.oficinaweg.modules.ordemdeservico.domain.model;

import com.senai.oficinaweg.modules.usuario.domain.model.Usuario;
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
    private Usuario professorResponsavel;

    @OneToMany
    @JoinColumn(name = "Usuario")
    private List<Usuario> alunosEscalados;

    public OrdemDeServico(String equipamento, String defeitoRelatado, StatusOs statusOs, String materiaisUsados, String conclusaoTecnica, Usuario professorResponsavel, List<Usuario> alunosEscalados) {
        this.equipamento = equipamento;
        this.defeitoRelatado = defeitoRelatado;
        this.statusOs = statusOs;
        this.materiaisUsados = materiaisUsados;
        this.conclusaoTecnica = conclusaoTecnica;
        this.professorResponsavel = professorResponsavel;
        this.alunosEscalados = alunosEscalados;
    }
}
