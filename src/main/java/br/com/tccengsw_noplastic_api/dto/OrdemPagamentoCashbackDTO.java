package br.com.tccengsw_noplastic_api.dto;

import br.com.tccengsw_noplastic_api.dto.commons.BaseDTO;
import br.com.tccengsw_noplastic_api.utils.CurrencyUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;
import java.math.BigDecimal;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public class OrdemPagamentoCashbackDTO extends BaseDTO {

    private BigDecimal codigoPagamento;
    private BigDecimal valor;
    private ContaBancariaDTO contaOrigem;
    private ContaBancariaDTO contaDestino;

    public String getValorFormatado() {
        return CurrencyUtils.converterParaMonetario(valor.doubleValue());
    }
}
