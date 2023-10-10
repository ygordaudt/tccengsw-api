package br.com.tccengsw_noplastic_api.model;

import br.com.tccengsw_noplastic_api.model.commons.LegalPersonEntity;
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
public class Parceiro extends LegalPersonEntity {

    @ManyToOne
    @JoinColumn
    private Parceiro matriz;

}
