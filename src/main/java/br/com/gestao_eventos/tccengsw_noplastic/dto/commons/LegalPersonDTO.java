package br.com.gestao_eventos.tccengsw_noplastic.dto.commons;

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
