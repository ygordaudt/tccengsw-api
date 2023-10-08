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
public class PersonDTO {

    private String telefone;
    private String email;
    private String cidade;
    private String estado;

}
