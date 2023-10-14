package br.com.tccengsw_noplastic_api.client.serpro.decoder;

import br.com.tccengsw_noplastic_api.client.serpro.exception.SerproClientException;
import feign.FeignException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        int status = response.status();
        if (status == 404) {
            throw new SerproClientException("Cupom fiscal não encontrado na SERPRO", status);
        } else if (status >= 400 && status <= 599) {
            throw new SerproClientException("Erro ao chamar o serviço Serpro: " + response.reason(), status);
        }
        return FeignException.errorStatus(methodKey, response);
    }
}