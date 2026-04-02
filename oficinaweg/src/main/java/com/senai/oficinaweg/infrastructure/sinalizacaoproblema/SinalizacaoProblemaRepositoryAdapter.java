package com.senai.oficinaweg.infrastructure.sinalizacaoproblema;

import com.senai.oficinaweg.modules.sinalizacaoproblema.domain.model.SinalizacaoProblema;
import com.senai.oficinaweg.modules.sinalizacaoproblema.domain.repository.ProblemaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class SinalizacaoProblemaRepositoryAdapter implements ProblemaRepository {

    private final SinalizacaoProblemaJpaRepository jpaRepository;

    @Override
    public SinalizacaoProblema save(SinalizacaoProblema sinalizacaoProblema) {
        return jpaRepository.save(sinalizacaoProblema);
    }

    @Override
    public List<SinalizacaoProblema> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public Optional<SinalizacaoProblema> findById(int id) {
        return jpaRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        jpaRepository.deleteById(id);
    }
}
