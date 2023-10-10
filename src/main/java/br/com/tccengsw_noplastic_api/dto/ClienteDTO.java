package br.com.tccengsw_noplastic_api.dto;

import br.com.tccengsw_noplastic_api.dto.commons.PhysicalPersonDTO;
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
public class ClienteDTO extends PhysicalPersonDTO {

    private ContaBancariaDTO contaBancaria;

}
