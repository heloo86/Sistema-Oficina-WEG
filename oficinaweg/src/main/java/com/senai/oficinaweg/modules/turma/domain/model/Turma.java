package com.senai.oficinaweg.modules.turma.domain.model;

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
public class Turma {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String nome;

    @OneToMany
    @JoinColumn (name = "idAlunos")
    private List<Usuario> alunos;
}
