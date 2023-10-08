package br.com.gestao_eventos.tccengsw_noplastic.repository;

import br.com.gestao_eventos.tccengsw_noplastic.model.TipoUnidadeMedida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoUnidadeMedidaRepository extends JpaRepository<TipoUnidadeMedida, Long> {

    Optional<TipoUnidadeMedida> findByNome(String nome);

}
