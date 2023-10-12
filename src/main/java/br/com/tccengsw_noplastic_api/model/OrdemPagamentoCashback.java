package br.com.tccengsw_noplastic_api.model;

import br.com.tccengsw_noplastic_api.model.commons.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
public class OrdemPagamentoCashback extends BaseEntity {

    @Column
    private Long codigoPagamento;

    @Column(precision = 2, nullable = false)
    private double valor;

    @ManyToOne
    @JoinColumn
    private ContaBancaria contaOrigem;

    @ManyToOne
    @JoinColumn
    private ContaBancaria contaDestino;

}
