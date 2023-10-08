package br.com.gestao_eventos.tccengsw_noplastic.factory;

import br.com.gestao_eventos.tccengsw_noplastic.client.serpro.dto.DetDTO;
import br.com.gestao_eventos.tccengsw_noplastic.client.serpro.dto.ProdDTO;
import br.com.gestao_eventos.tccengsw_noplastic.model.ItemProduto;
import br.com.gestao_eventos.tccengsw_noplastic.service.TipoUnidadeMedidaService;
import br.com.gestao_eventos.tccengsw_noplastic.utils.ConstantUtils;
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
