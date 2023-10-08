package br.com.gestao_eventos.tccengsw_noplastic.builder;

import br.com.gestao_eventos.tccengsw_noplastic.model.TipoUnidadeMedida;
import lombok.experimental.UtilityClass;

import static br.com.gestao_eventos.tccengsw_noplastic.utils.ConstantUtils.DEFAULT_DESC_UNIDADE_MEDIDA;
import static br.com.gestao_eventos.tccengsw_noplastic.utils.ConstantUtils.DEFAULT_NOME_UNIDADE_MEDIDA;

@UtilityClass
public class TipoUnidadeMedidaBuilder {

    public static TipoUnidadeMedida fromDefault() {
        return TipoUnidadeMedida.builder()
                .nome(DEFAULT_NOME_UNIDADE_MEDIDA)
                .descricao(DEFAULT_DESC_UNIDADE_MEDIDA)
                .build();
    }

}
