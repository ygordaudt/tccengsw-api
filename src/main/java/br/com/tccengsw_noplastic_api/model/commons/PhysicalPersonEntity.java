package br.com.tccengsw_noplastic_api.model.commons;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public abstract class PhysicalPersonEntity extends PersonEntity {

    @Column(nullable = false)
    private String cpf;

}
