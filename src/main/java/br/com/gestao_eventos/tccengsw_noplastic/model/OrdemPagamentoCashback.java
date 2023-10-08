package br.com.gestao_eventos.tccengsw_noplastic.model;

import br.com.gestao_eventos.tccengsw_noplastic.model.commons.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
public class OrdemPagamentoCashback extends BaseEntity {

    @Column
    private BigDecimal codigoPagamento;

    @Column(precision = 2, nullable = false)
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn
    private ContaBancaria contaOrigem;

    @ManyToOne
    @JoinColumn
    private ContaBancaria contaDestino;

}
