package com.senai.oficinaweg.modules.turma.domain.service;

import com.senai.oficinaweg.modules.turma.domain.model.Turma;
import com.senai.oficinaweg.modules.turma.domain.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TurmaService {

    private final TurmaRepository repository;

    public List<Turma> listarTurmaEALunos (){
        return repository.findAll();
    }
}
