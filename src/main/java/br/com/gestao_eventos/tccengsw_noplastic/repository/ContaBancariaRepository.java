package br.com.gestao_eventos.tccengsw_noplastic.repository;

import br.com.gestao_eventos.tccengsw_noplastic.model.ContaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaBancariaRepository extends JpaRepository<ContaBancaria, Long> {
}
