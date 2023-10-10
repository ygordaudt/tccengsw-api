package br.com.tccengsw_noplastic_api.dto.commons;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public class BaseDTO {

    private Long id;
    private LocalDateTime dataAtualizacao;
    private Boolean excluido;

}
