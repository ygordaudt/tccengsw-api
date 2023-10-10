package br.com.tccengsw_noplastic_api.dto;

import br.com.tccengsw_noplastic_api.dto.commons.BaseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public class CupomFiscalDTO extends BaseDTO {

    private String codigo;
    private List<ItemProdutoDTO> itensProduto;
    private ParceiroDTO parceiro;
    private ClienteDTO cliente;
    private double valorTotal;
    private double quantidadeTotal;

}
