package br.com.tccengsw_noplastic_api.dto;

import br.com.tccengsw_noplastic_api.dto.commons.BaseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public class ContaBancariaDTO extends BaseDTO {

    private String numeroBanco;
    private String numeroAgencia;
    private String numeroConta;
    private String chavePIX;

}
