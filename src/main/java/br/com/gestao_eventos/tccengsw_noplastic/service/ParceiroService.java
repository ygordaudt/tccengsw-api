package br.com.gestao_eventos.tccengsw_noplastic.service;

import br.com.gestao_eventos.tccengsw_noplastic.model.Parceiro;
import br.com.gestao_eventos.tccengsw_noplastic.repository.ParceiroRepository;
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
