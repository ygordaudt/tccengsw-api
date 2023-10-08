package br.com.gestao_eventos.tccengsw_noplastic.service;

import br.com.gestao_eventos.tccengsw_noplastic.builder.TipoUnidadeMedidaBuilder;
import br.com.gestao_eventos.tccengsw_noplastic.model.TipoUnidadeMedida;
import br.com.gestao_eventos.tccengsw_noplastic.repository.TipoUnidadeMedidaRepository;
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
