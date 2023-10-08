package br.com.gestao_eventos.tccengsw_noplastic.dto;

import br.com.gestao_eventos.tccengsw_noplastic.dto.commons.BaseDTO;
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
