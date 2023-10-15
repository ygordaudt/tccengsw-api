package br.com.tccengsw_noplastic_api.validator;

import br.com.tccengsw_noplastic_api.dto.SolicitacaoCashbackDTO;
import br.com.tccengsw_noplastic_api.model.enums.StatusSolicitacaoCashbackEnum;
import br.com.tccengsw_noplastic_api.service.SolicitacaoCashbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SolicitacaoCashbackJaConcluidaValidator {

    private final SolicitacaoCashbackService solicitacaoCashbackService;

    public void validate(Long idSolicitacao) {
        SolicitacaoCashbackDTO solicitacaoCashback = solicitacaoCashbackService.buscar(idSolicitacao);
        if (StatusSolicitacaoCashbackEnum.CONCLUIDO.equals(solicitacaoCashback.getStatusAtual())) {
            throw new IllegalArgumentException("Esta solicitação de cashback já se encontra concluída.");
        }
    }

}
