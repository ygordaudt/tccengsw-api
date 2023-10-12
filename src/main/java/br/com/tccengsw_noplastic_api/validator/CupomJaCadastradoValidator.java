package br.com.tccengsw_noplastic_api.validator;

import br.com.tccengsw_noplastic_api.model.CupomFiscal;
import br.com.tccengsw_noplastic_api.repository.CupomFiscalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CupomJaCadastradoValidator {

    private final CupomFiscalRepository cupomFiscalRepository;

    public void validate(String codigoCupom) {
        Optional<CupomFiscal> cupomFiscal = cupomFiscalRepository.findByCodigo(codigoCupom);
        if (cupomFiscal.isPresent()) {
            throw new IllegalArgumentException("Este cupom já se encontra cadastrado.");
        }
    }

}
