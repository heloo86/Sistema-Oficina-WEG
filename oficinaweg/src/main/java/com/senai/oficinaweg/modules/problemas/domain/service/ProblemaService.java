package com.senai.oficinaweg.modules.problemas.domain.service;

import com.senai.oficinaweg.modules.problemas.domain.model.SinalizacaoProblema;
import com.senai.oficinaweg.modules.problemas.domain.repository.ProblemaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProblemaService {

    private final ProblemaRepository repository;

    public SinalizacaoProblema sinalizarProblema (SinalizacaoProblema problema){
        return repository.save(problema);
    }
}
