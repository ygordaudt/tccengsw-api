package br.com.gestao_eventos.tccengsw_noplastic.dto;

import br.com.gestao_eventos.tccengsw_noplastic.dto.commons.NamedDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public class ItemProdutoDTO extends NamedDTO {

    private double quantidade;
    private double valorUnitario;
    private TipoUnidadeMedidaDTO tipoUnidadeMedida;

}
