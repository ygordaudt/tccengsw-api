package br.com.tccengsw_noplastic_api.service;

import br.com.tccengsw_noplastic_api.model.Parceiro;
import br.com.tccengsw_noplastic_api.repository.ParceiroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ParceiroService {

    private final ParceiroRepository repository;

    public Parceiro buscar(String cnpj) {
        return repository.findByCnpj(cnpj)
                .orElseThrow(() -> new NotFoundException("Parceiro não encontrado"));
    }

    public Parceiro sincronizar(Parceiro parceiro) {
        Optional<Parceiro> parceiroEncontrado = repository.findByCnpj(parceiro.getCnpj());
        return parceiroEncontrado.map(repository::save)
                .orElseGet(() -> repository.save(parceiro));

    }

}
