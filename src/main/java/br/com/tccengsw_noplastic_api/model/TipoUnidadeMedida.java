package br.com.tccengsw_noplastic_api.model;

import br.com.tccengsw_noplastic_api.model.commons.NamedEntity;
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
public class TipoUnidadeMedida extends NamedEntity {

    @Column(nullable = false)
    private String descricao;

}
