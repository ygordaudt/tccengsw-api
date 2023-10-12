package br.com.tccengsw_noplastic_api.dto;

import br.com.tccengsw_noplastic_api.dto.commons.BaseDTO;
import br.com.tccengsw_noplastic_api.model.enums.StatusSolicitacaoCashbackEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public class AtividadeHistoricoSolicitacaoCashbackDTO extends BaseDTO {

    private StatusSolicitacaoCashbackEnum status;
    private String observacao;

}
