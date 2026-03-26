package com.senai.oficinaweg.modules.ordemdeservico.domain.repository;

import com.senai.oficinaweg.modules.ordemdeservico.domain.model.OrdemDeServico;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrdemServicoRepository {

    OrdemDeServico save(OrdemDeServico OrdemDeServico);
    List<OrdemDeServico> findAll();
    Optional<OrdemDeServico> findById(int Id);
    void deleteById(int id);
}
