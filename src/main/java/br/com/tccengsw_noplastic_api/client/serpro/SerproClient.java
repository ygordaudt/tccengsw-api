package br.com.tccengsw_noplastic_api.client.serpro;

import br.com.tccengsw_noplastic_api.client.serpro.dto.NfeResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "SerproClient", url = "https://gateway.apiserpro.serpro.gov.br/consulta-nfe-df-trial")
public interface SerproClient {

    @GetMapping(value = "/api/v1/nfe/{nfeId}", produces = "application/json")
    NfeResponseDTO getNfe(@PathVariable("nfeId") String nfeId,
                          @RequestHeader("Authorization") String authorization);

}
