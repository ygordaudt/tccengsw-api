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
public class Notificacao extends BaseEntity {

    @Column
    private String emailOrigem;

    @Column
    private String emailDestino;

    @Column
    private String conteudo;

}
