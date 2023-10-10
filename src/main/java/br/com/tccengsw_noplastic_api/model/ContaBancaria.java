package br.com.tccengsw_noplastic_api.model;

import br.com.tccengsw_noplastic_api.model.commons.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
public class ContaBancaria extends BaseEntity {

    @Column(nullable = false)
    private String numeroBanco;

    @Column(nullable = false)
    private String numeroAgencia;

    @Column(nullable = false)
    private String numeroConta;

    @Column(nullable = false)
    private String chavePIX;

}
