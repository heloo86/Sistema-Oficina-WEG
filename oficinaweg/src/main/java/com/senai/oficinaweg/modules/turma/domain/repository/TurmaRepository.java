package com.senai.oficinaweg.modules.turma.domain.repository;

import com.senai.oficinaweg.modules.turma.domain.model.Turma;

import java.util.List;
import java.util.Optional;

public interface TurmaRepository {
    Turma save(Turma turma);
    List<Turma> findAll();
    Optional<Turma> findById(int Id);
    void deleteById(int id);
}
