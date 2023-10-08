package br.com.gestao_eventos.tccengsw_noplastic.model;

import br.com.gestao_eventos.tccengsw_noplastic.model.commons.PhysicalPersonEntity;
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
public class Cliente extends PhysicalPersonEntity {

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private ContaBancaria contaBancaria;

}
