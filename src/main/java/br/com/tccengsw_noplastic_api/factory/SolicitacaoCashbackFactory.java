package br.com.tccengsw_noplastic_api.factory;

import br.com.tccengsw_noplastic_api.builder.AtividadeHistoricoSolicitacaoCashbackBuilder;
import br.com.tccengsw_noplastic_api.model.CupomFiscal;
import br.com.tccengsw_noplastic_api.model.OrdemPagamentoCashback;
import br.com.tccengsw_noplastic_api.model.SolicitacaoCashback;
import br.com.tccengsw_noplastic_api.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SolicitacaoCashbackFactory {

    private final CupomFiscalFactory cupomFiscalFactory;
    private final ClienteService clienteService;
    private static final double COEFICIENTE_CASHBACK = 0.01;

    public SolicitacaoCashback fabricate(String codigoCupomFiscal, String loginCliente) {
        CupomFiscal cupomFiscal = cupomFiscalFactory.fabricate(codigoCupomFiscal);
        return SolicitacaoCashback.builder()
                .cupomFiscal(cupomFiscal)
                .cliente(clienteService.sincronizar(loginCliente))
                .atividadesHistorico(List.of(
                        AtividadeHistoricoSolicitacaoCashbackBuilder.buildNovaSolicitacao()))
                .ordemPagamentoCashback(
                        OrdemPagamentoCashback.builder()
                                .valor(BigDecimal.valueOf(cupomFiscal.getQuantidadeTotal() * COEFICIENTE_CASHBACK))
                                .build())
                .build();
    }
}
