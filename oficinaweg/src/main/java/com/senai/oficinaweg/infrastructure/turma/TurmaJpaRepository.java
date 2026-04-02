package com.senai.oficinaweg.infrastructure.turma;

import com.senai.oficinaweg.modules.turma.domain.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaJpaRepository extends JpaRepository<Turma, Integer> {
}
