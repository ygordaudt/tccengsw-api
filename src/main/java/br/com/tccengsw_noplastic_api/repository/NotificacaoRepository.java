package br.com.tccengsw_noplastic_api.repository;

import br.com.tccengsw_noplastic_api.model.Notificacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacaoRepository extends JpaRepository<Notificacao, Long> {
}
