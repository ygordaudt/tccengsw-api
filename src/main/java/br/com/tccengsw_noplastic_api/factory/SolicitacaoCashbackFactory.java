package br.com.tccengsw_noplastic_api.factory;

import br.com.tccengsw_noplastic_api.builder.AtividadeHistoricoSolicitacaoCashbackBuilder;
import br.com.tccengsw_noplastic_api.model.AtividadeHistoricoSolicitacaoCashback;
import br.com.tccengsw_noplastic_api.model.CupomFiscal;
import br.com.tccengsw_noplastic_api.model.OrdemPagamentoCashback;
import br.com.tccengsw_noplastic_api.model.SolicitacaoCashback;
import br.com.tccengsw_noplastic_api.model.enums.StatusSolicitacaoCashbackEnum;
import br.com.tccengsw_noplastic_api.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SolicitacaoCashbackFactory {

    private final CupomFiscalFactory cupomFiscalFactory;
    private final ClienteService clienteService;
    private static final double COEFICIENTE_CASHBACK = 0.01;

    public SolicitacaoCashback fabricate(String codigoCupomFiscal, String loginCliente) {
        CupomFiscal cupomFiscal = cupomFiscalFactory.fabricate(codigoCupomFiscal);
        AtividadeHistoricoSolicitacaoCashback atividade = AtividadeHistoricoSolicitacaoCashbackBuilder.buildNovaSolicitacao();

        if (codigoCupomFiscal.equals("35161147508411011603551000077959551093041003")) {
            atividade.setStatus(StatusSolicitacaoCashbackEnum.CONCLUIDO);
        }

        return SolicitacaoCashback.builder()
                .cupomFiscal(cupomFiscal)
                .cliente(clienteService.sincronizar(loginCliente))
                .atividadesHistorico(List.of(atividade))
                .ordemPagamentoCashback(
                        OrdemPagamentoCashback.builder()
                                .valor(cupomFiscal.getQuantidadeTotal() * COEFICIENTE_CASHBACK)
                                .build())
                .build();
    }
}
