package br.com.tccengsw_noplastic_api.validator;

import br.com.tccengsw_noplastic_api.model.SolicitacaoCashback;
import br.com.tccengsw_noplastic_api.repository.SolicitacaoCashbackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SolicitacaoCashbackJaConcluidaValidator {

    private final SolicitacaoCashbackRepository solicitacaoCashbackRepository;

    public void validate(Long idSolicitacao) {
        Optional<SolicitacaoCashback> solicitacaoCashback = solicitacaoCashbackRepository.findById(idSolicitacao);
        if (solicitacaoCashback.isPresent()) {
            throw new IllegalArgumentException("Esta solicitação de cashback já se encontra concluída.");
        }
    }

}
