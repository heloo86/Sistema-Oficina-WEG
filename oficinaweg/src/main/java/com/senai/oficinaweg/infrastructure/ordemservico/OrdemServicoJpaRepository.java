package com.senai.oficinaweg.infrastructure.ordemservico;

import com.senai.oficinaweg.modules.ordemdeservico.domain.model.OrdemDeServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemServicoJpaRepository extends JpaRepository<OrdemDeServico, Integer> {
}
