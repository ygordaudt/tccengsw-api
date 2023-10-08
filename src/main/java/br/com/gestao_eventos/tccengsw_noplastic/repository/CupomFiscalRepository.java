package br.com.gestao_eventos.tccengsw_noplastic.repository;

import br.com.gestao_eventos.tccengsw_noplastic.model.CupomFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CupomFiscalRepository extends JpaRepository<CupomFiscal, Long> {

    Optional<CupomFiscal> findByCodigo(String codigo);
}
