package br.com.gestao_eventos.tccengsw_noplastic.dto;

import br.com.gestao_eventos.tccengsw_noplastic.dto.commons.LegalPersonDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class ParceiroDTO extends LegalPersonDTO {

    @JsonIgnore
    private ParceiroDTO matriz;

}
