package br.com.gestao_eventos.tccengsw_noplastic.model;

import br.com.gestao_eventos.tccengsw_noplastic.model.commons.BaseEntity;
import br.com.gestao_eventos.tccengsw_noplastic.model.enums.StatusSolicitacaoCashback;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
public class AtividadeHistoricoSolicitacaoCashback extends BaseEntity {

    @Column(nullable = false)
    private StatusSolicitacaoCashback status;

    @Column
    private String observacao;

}
