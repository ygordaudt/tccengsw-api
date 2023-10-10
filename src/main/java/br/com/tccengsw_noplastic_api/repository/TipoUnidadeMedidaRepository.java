package br.com.tccengsw_noplastic_api.repository;

import br.com.tccengsw_noplastic_api.model.TipoUnidadeMedida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoUnidadeMedidaRepository extends JpaRepository<TipoUnidadeMedida, Long> {

    Optional<TipoUnidadeMedida> findByNome(String nome);

}
