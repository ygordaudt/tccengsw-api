package br.com.gestao_eventos.tccengsw_noplastic.repository;

import br.com.gestao_eventos.tccengsw_noplastic.model.Notificacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacaoRepository extends JpaRepository<Notificacao, Long> {
}
