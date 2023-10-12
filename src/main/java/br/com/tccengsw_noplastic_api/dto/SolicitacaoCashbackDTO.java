package br.com.tccengsw_noplastic_api.dto;

import br.com.tccengsw_noplastic_api.dto.commons.BaseDTO;
import br.com.tccengsw_noplastic_api.model.enums.StatusSolicitacaoCashbackEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public class SolicitacaoCashbackDTO extends BaseDTO {

    private CupomFiscalDTO cupomFiscal;
    private ClienteDTO cliente;
    private OrdemPagamentoCashbackDTO ordemPagamentoCashback;
    private List<AtividadeHistoricoSolicitacaoCashbackDTO> atividadesHistorico;

    public StatusSolicitacaoCashbackEnum getStatusAtual() {
        int quantidadeAtividades = atividadesHistorico.size();
        return (quantidadeAtividades > 0) ?
                atividadesHistorico.get(quantidadeAtividades - 1).getStatus() : null;
    }
}
