package br.com.tccengsw_noplastic_api.dto.commons;

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
public class LegalPersonDTO extends PersonDTO {

    private String cnpj;

}
