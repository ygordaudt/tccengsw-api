package br.com.gestao_eventos.tccengsw_noplastic.model;

import br.com.gestao_eventos.tccengsw_noplastic.model.commons.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
public class CupomFiscal extends BaseEntity {

    @Column(nullable = false)
    private String codigo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "cupom_fiscal_id")
    @Builder.Default
    private List<ItemProduto> itensProduto = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Parceiro parceiro;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Cliente cliente;

    @Column
    @Builder.Default
    private Double valorTotal = 0.0;

    @Column
    @Builder.Default
    private Double quantidadeTotal = 0.0;

}
