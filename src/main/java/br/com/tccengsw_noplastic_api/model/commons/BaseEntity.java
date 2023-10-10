package br.com.tccengsw_noplastic_api.model.commons;

import br.com.tccengsw_noplastic_api.converter.BooleanConverter;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Builder.Default
    @Column(nullable = false)
    private LocalDateTime dataAtualizacao = LocalDateTime.now();

    @Builder.Default
    @Convert(converter = BooleanConverter.class)
    private Boolean excluido = Boolean.FALSE;
}
