package br.com.tccengsw_noplastic_api.service;

import br.com.tccengsw_noplastic_api.builder.TipoUnidadeMedidaBuilder;
import br.com.tccengsw_noplastic_api.model.TipoUnidadeMedida;
import br.com.tccengsw_noplastic_api.repository.TipoUnidadeMedidaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TipoUnidadeMedidaService {

    private final TipoUnidadeMedidaRepository repository;

    public TipoUnidadeMedida sincronizar(String nome) {
        Optional<TipoUnidadeMedida> tipoEncontrado = repository.findByNome(nome);
        return tipoEncontrado.map(repository::save)
                .orElseGet(() -> repository.save(TipoUnidadeMedidaBuilder.fromDefault()));
    }
}
