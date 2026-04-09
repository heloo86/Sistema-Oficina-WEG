package com.senai.oficinaweg.modules.usuario.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column
    private TipoUsuario tipoUsuario;

    public Usuario(String nome, TipoUsuario tipoUsuario) {
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }
}
