package br.com.tccengsw_noplastic_api.factory;

import br.com.tccengsw_noplastic_api.client.serpro.dto.DetDTO;
import br.com.tccengsw_noplastic_api.client.serpro.dto.ProdDTO;
import br.com.tccengsw_noplastic_api.model.ItemProduto;
import br.com.tccengsw_noplastic_api.service.TipoUnidadeMedidaService;
import br.com.tccengsw_noplastic_api.utils.ConstantUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemProdutoFactory {

    private final TipoUnidadeMedidaService tipoUnidadeMedidaService;

    public ItemProduto fabricate(DetDTO detDTO) {
        ProdDTO prodDTO = detDTO.getProd();
        return ItemProduto.builder()
                .numero(detDTO.getNItem())
                .nome(prodDTO.getXProd().replaceAll("\\s+", " "))
                .tipoUnidadeMedida(tipoUnidadeMedidaService.sincronizar(ConstantUtils.DEFAULT_NOME_UNIDADE_MEDIDA))
                .valorUnitario(prodDTO.getVUnTrib())
                .quantidade(prodDTO.getQTrib())
                .build();
    }
}
