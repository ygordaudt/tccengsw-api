package br.com.tccengsw_noplastic_api.client.serpro.decoder;

import br.com.tccengsw_noplastic_api.client.serpro.exception.SerproClientException;
import feign.FeignException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() >= 400 && response.status() <= 599) {
            throw new SerproClientException("Erro ao chamar o serviço Serpro: " + response.reason());
        }
        return FeignException.errorStatus(methodKey, response);
    }
}