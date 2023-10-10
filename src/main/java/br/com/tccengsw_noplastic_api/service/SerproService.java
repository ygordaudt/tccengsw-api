package br.com.tccengsw_noplastic_api.service;

import br.com.tccengsw_noplastic_api.client.serpro.SerproClient;
import br.com.tccengsw_noplastic_api.client.serpro.dto.NfeResponseDTO;
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
