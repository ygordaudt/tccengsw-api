package br.com.tccengsw_noplastic_api.service;

import br.com.tccengsw_noplastic_api.builder.ClienteBuilder;
import br.com.tccengsw_noplastic_api.model.Cliente;
import br.com.tccengsw_noplastic_api.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public Cliente sincronizar(String loginCliente) {
        return repository.findByLogin(loginCliente)
                .orElseGet(() -> repository.save(ClienteBuilder.newDefault(loginCliente)));
    }

}
