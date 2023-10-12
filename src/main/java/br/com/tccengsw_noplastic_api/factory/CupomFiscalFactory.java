package br.com.tccengsw_noplastic_api.factory;

import br.com.tccengsw_noplastic_api.builder.ParceiroBuilder;
import br.com.tccengsw_noplastic_api.client.serpro.dto.InfNfeDTO;
import br.com.tccengsw_noplastic_api.client.serpro.dto.NfeProcDTO;
import br.com.tccengsw_noplastic_api.client.serpro.dto.NfeResponseDTO;
import br.com.tccengsw_noplastic_api.model.CupomFiscal;
import br.com.tccengsw_noplastic_api.model.ItemProduto;
import br.com.tccengsw_noplastic_api.service.ParceiroService;
import br.com.tccengsw_noplastic_api.service.SerproService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CupomFiscalFactory {

    private final SerproService serproService;
    private final ParceiroService parceiroService;
    private final ItemProdutoFactory itemProdutoFactory;

    public CupomFiscal fabricate(String codigo) {
        NfeResponseDTO nfeResponseDTO = serproService.getNfe(codigo);
        NfeProcDTO nfeProc = nfeResponseDTO.getNfeProc();
        InfNfeDTO infNfeDTO = nfeProc.getNFe().getInfNFe();
        List<ItemProduto> itens =  infNfeDTO.getDet().stream().map(itemProdutoFactory::fabricate).toList();
        return CupomFiscal.builder()
                .parceiro(parceiroService.sincronizar(ParceiroBuilder.fromNfe(nfeResponseDTO)))
                .codigo(String.valueOf(nfeProc.getProtNFe().getInfProt().getChNFe()))
                .itensProduto(itens)
                .build();
    }

}
