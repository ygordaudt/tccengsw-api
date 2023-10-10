package br.com.tccengsw_noplastic_api.repository;

import br.com.tccengsw_noplastic_api.model.OrdemPagamentoCashback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemPagamentoCashbackRepository
        extends JpaRepository<OrdemPagamentoCashback, Long> {
}
