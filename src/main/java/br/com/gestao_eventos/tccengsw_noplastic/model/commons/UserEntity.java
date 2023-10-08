package br.com.gestao_eventos.tccengsw_noplastic.model.commons;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import static br.com.gestao_eventos.tccengsw_noplastic.utils.ConstantUtils.DEFAULT_PASSWORD;
import static br.com.gestao_eventos.tccengsw_noplastic.utils.ConstantUtils.DEFAULT_USER;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class UserEntity extends NamedEntity {

    @Column(nullable = false)
    @Builder.Default
    private String login = DEFAULT_USER;

    @Column(nullable = false)
    @Builder.Default
    private String password = DEFAULT_PASSWORD;

}
