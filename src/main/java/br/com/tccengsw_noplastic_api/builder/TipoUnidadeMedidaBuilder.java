package br.com.tccengsw_noplastic_api.builder;

import br.com.tccengsw_noplastic_api.model.TipoUnidadeMedida;
import br.com.tccengsw_noplastic_api.utils.ConstantUtils;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TipoUnidadeMedidaBuilder {

    public static TipoUnidadeMedida fromDefault() {
        return TipoUnidadeMedida.builder()
                .nome(ConstantUtils.DEFAULT_NOME_UNIDADE_MEDIDA)
                .descricao(ConstantUtils.DEFAULT_DESC_UNIDADE_MEDIDA)
                .build();
    }

}
