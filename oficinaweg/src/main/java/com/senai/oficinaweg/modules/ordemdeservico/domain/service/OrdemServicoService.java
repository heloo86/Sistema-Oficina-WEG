package com.senai.oficinaweg.modules.ordemdeservico.service;

import com.senai.oficinaweg.modules.ordemdeservico.exceptions.AcessoNegadoExeption;
import com.senai.oficinaweg.modules.ordemdeservico.model.OrdemDeServico;
import com.senai.oficinaweg.modules.ordemdeservico.repository.OrdemServicoRepository;
import com.senai.oficinaweg.modules.usuario.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrdemServicoService {

    private final UsuarioService usuarioService;
    private final OrdemServicoRepository repository;

    public OrdemDeServico registrarOrdemServico (OrdemDeServico ordemDeServico, int idUsuario){
        if(usuarioService.isUsuarioProfessor(idUsuario)){
            return repository.save(ordemDeServico);
        } else {
            throw  new AcessoNegadoExeption("Apenas um professor pode registrar uma Ordem de Serviço");
        }
    }
}
