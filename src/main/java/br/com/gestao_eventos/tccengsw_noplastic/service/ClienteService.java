package br.com.gestao_eventos.tccengsw_noplastic.service;

import br.com.gestao_eventos.tccengsw_noplastic.builder.ClienteBuilder;
import br.com.gestao_eventos.tccengsw_noplastic.model.Cliente;
import br.com.gestao_eventos.tccengsw_noplastic.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public Cliente sincronizar(String loginCliente) {
        repository.findByLogin(loginCliente).ifPresent(repository::delete);
        return repository.save(ClienteBuilder.newDefault(loginCliente));
    }

}
