package br.com.tccengsw_noplastic_api.factory;

import br.com.tccengsw_noplastic_api.model.TipoUnidadeMedida;
import br.com.tccengsw_noplastic_api.service.TipoUnidadeMedidaService;
import br.com.tccengsw_noplastic_api.utils.ConstantUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TipoUnidadeMedidaFactory {

    private final TipoUnidadeMedidaService tipoUnidadeMedidaService;

    public TipoUnidadeMedida fabricate() {
        return tipoUnidadeMedidaService.sincronizar(ConstantUtils.DEFAULT_NOME_UNIDADE_MEDIDA);
    }
}
