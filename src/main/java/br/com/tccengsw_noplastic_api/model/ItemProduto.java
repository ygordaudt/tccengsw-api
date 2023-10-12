package br.com.tccengsw_noplastic_api.model;

import br.com.tccengsw_noplastic_api.model.commons.NamedEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
public class ItemProduto extends NamedEntity {

    @Column
    private int numero;

    @Column
    private double quantidade;

    @Column
    private double valorUnitario;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private TipoUnidadeMedida tipoUnidadeMedida;

}
