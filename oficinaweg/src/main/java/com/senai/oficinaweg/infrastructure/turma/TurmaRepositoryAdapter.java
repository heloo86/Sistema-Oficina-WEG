package com.senai.oficinaweg.infrastructure.turma;



import com.senai.oficinaweg.modules.turma.domain.model.Turma;
import com.senai.oficinaweg.modules.turma.domain.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class TurmaRepositoryAdapter implements TurmaRepository {

    private final TurmaJpaRepository jpaRepository;


    @Override
    public Turma save(Turma turma) {
        return jpaRepository.save(turma);
    }

    @Override
    public List<Turma> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public Optional<Turma> findById(int id) {
        return jpaRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        jpaRepository.deleteById(id);
    }
}
