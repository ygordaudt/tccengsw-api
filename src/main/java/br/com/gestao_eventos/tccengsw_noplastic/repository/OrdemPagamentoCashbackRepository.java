package br.com.gestao_eventos.tccengsw_noplastic.repository;

import br.com.gestao_eventos.tccengsw_noplastic.model.OrdemPagamentoCashback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemPagamentoCashbackRepository
        extends JpaRepository<OrdemPagamentoCashback, Long> {
}
