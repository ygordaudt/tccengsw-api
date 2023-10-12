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
public class PersonDTO extends NamedDTO {

    private String telefone;
    private String email;
    private String cidade;
    private String estado;

}
