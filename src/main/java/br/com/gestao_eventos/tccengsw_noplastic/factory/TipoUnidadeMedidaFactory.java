package br.com.gestao_eventos.tccengsw_noplastic.factory;

import br.com.gestao_eventos.tccengsw_noplastic.model.TipoUnidadeMedida;
import br.com.gestao_eventos.tccengsw_noplastic.service.TipoUnidadeMedidaService;
import br.com.gestao_eventos.tccengsw_noplastic.utils.ConstantUtils;
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
