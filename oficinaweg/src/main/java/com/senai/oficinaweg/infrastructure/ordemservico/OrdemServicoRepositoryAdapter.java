package com.senai.oficinaweg.infrastructure.ordemservico;

import com.senai.oficinaweg.modules.ordemdeservico.domain.model.OrdemDeServico;
import com.senai.oficinaweg.modules.ordemdeservico.domain.repository.OrdemServicoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class OrdemServicoRepositoryAdapter implements OrdemServicoRepository {

    private final OrdemServicoJpaRepository jpaRepository;

    @Override
    public OrdemDeServico save(OrdemDeServico ordemDeServico) {
        return jpaRepository.save(ordemDeServico);
    }

    @Override
    public List<OrdemDeServico> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public Optional<OrdemDeServico> findById(int id) {
        return jpaRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        jpaRepository.deleteById(id);
    }
}
