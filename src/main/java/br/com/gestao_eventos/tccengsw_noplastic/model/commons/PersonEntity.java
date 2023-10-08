package br.com.gestao_eventos.tccengsw_noplastic.model.commons;

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
public abstract class PersonEntity extends UserEntity {

    @Column
    private String telefone;

    @Column
    private String email;

    @Column
    private String cidade;

    @Column
    private String estado;
}
