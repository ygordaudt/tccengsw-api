package br.com.tccengsw_noplastic_api.repository;

import br.com.tccengsw_noplastic_api.model.CupomFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CupomFiscalRepository extends JpaRepository<CupomFiscal, Long> {

    Optional<CupomFiscal> findByCodigo(String codigo);
}
