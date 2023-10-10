package br.com.tccengsw_noplastic_api.repository;

import br.com.tccengsw_noplastic_api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByLogin(String login);

}
