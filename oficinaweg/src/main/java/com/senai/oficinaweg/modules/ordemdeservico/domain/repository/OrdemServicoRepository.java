package com.senai.oficinaweg.modules.ordemdeservico.repository;

import com.senai.oficinaweg.modules.ordemdeservico.model.OrdemDeServico;

import java.util.List;
import java.util.Optional;

public interface OrdemServicoRepository {

    OrdemDeServico save(OrdemDeServico OrdemDeServico);
    List<OrdemDeServico> findAll();
    Optional<OrdemDeServico> findById(int Id);
    void deleteById(int id);
}
