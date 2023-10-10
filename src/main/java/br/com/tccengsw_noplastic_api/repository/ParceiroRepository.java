package br.com.tccengsw_noplastic_api.repository;

import br.com.tccengsw_noplastic_api.model.Parceiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParceiroRepository extends JpaRepository<Parceiro, Long> {

    Optional<Parceiro> findByCnpj(String cnpj);

}
