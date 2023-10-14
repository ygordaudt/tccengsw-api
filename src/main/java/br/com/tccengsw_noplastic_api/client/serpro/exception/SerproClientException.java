package br.com.tccengsw_noplastic_api.client.serpro.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SerproClientException extends RuntimeException {

    private int status;

    public SerproClientException(String message, int status) {
        super(message);
        this.status = status;
    }
}