package com.senai.oficinaweg.modules.problemas.domain.repository;

import com.senai.oficinaweg.modules.problemas.domain.model.SinalizacaoProblema;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProblemaRepository {

    SinalizacaoProblema save(SinalizacaoProblema SinalizacaoProblema);
    List<SinalizacaoProblema> findAll();
    Optional<SinalizacaoProblema> findById(int Id);
    void deleteById(int id);
}
