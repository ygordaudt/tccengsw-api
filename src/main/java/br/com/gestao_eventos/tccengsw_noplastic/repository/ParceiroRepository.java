package br.com.gestao_eventos.tccengsw_noplastic.repository;

import br.com.gestao_eventos.tccengsw_noplastic.model.Parceiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParceiroRepository extends JpaRepository<Parceiro, Long> {

    Optional<Parceiro> findByCnpj(String cnpj);

}
