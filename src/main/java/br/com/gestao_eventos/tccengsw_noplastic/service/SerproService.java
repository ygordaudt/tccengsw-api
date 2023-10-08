package br.com.gestao_eventos.tccengsw_noplastic.service;

import br.com.gestao_eventos.tccengsw_noplastic.client.serpro.SerproClient;
import br.com.gestao_eventos.tccengsw_noplastic.client.serpro.dto.NfeResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SerproService {

    private final SerproClient serproClient;
    private static final String AUTHORIZATION = "Bearer Bearer 06aef429-a981-3ec5-a1f8-71d38d86481e";

    public NfeResponseDTO getNfe(String nfeId) {
        return serproClient.getNfe(nfeId, AUTHORIZATION);
    }

}
