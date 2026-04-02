package com.senai.oficinaweg.infrastructure.sinalizacaoproblema;

import com.senai.oficinaweg.modules.sinalizacaoproblema.domain.model.SinalizacaoProblema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SinalizacaoProblemaJpaRepository extends JpaRepository<SinalizacaoProblema, Integer> {
}
