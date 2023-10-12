package br.com.tccengsw_noplastic_api.model;

import br.com.tccengsw_noplastic_api.model.commons.BaseEntity;
import br.com.tccengsw_noplastic_api.model.enums.StatusSolicitacaoCashbackEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
public class AtividadeHistoricoSolicitacaoCashback extends BaseEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusSolicitacaoCashbackEnum status;

    @Column
    private String observacao;

}
