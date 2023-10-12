package br.com.tccengsw_noplastic_api.builder;

import br.com.tccengsw_noplastic_api.model.AtividadeHistoricoSolicitacaoCashback;
import br.com.tccengsw_noplastic_api.model.enums.StatusSolicitacaoCashbackEnum;
import lombok.experimental.UtilityClass;

import static br.com.tccengsw_noplastic_api.utils.MessageUtils.MSG_OBSERVACAO_NOVA_SOLICITACAO;

@UtilityClass
public class AtividadeHistoricoSolicitacaoCashbackBuilder {

    public static AtividadeHistoricoSolicitacaoCashback buildNovaSolicitacao() {
        return AtividadeHistoricoSolicitacaoCashback.builder()
                .status(StatusSolicitacaoCashbackEnum.PROCESSANDO)
                .observacao(MSG_OBSERVACAO_NOVA_SOLICITACAO)
                .build();
    }

}
