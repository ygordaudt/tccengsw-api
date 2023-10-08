package br.com.gestao_eventos.tccengsw_noplastic.factory;

import br.com.gestao_eventos.tccengsw_noplastic.builder.ParceiroBuilder;
import br.com.gestao_eventos.tccengsw_noplastic.client.serpro.dto.InfNfeDTO;
import br.com.gestao_eventos.tccengsw_noplastic.client.serpro.dto.NfeProcDTO;
import br.com.gestao_eventos.tccengsw_noplastic.client.serpro.dto.NfeResponseDTO;
import br.com.gestao_eventos.tccengsw_noplastic.model.CupomFiscal;
import br.com.gestao_eventos.tccengsw_noplastic.model.ItemProduto;
import br.com.gestao_eventos.tccengsw_noplastic.service.ClienteService;
import br.com.gestao_eventos.tccengsw_noplastic.service.ParceiroService;
import br.com.gestao_eventos.tccengsw_noplastic.service.SerproService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CupomFiscalFactory {

    private final SerproService serproService;
    private final ParceiroService parceiroService;
    private final ClienteService clienteService;
    private final ItemProdutoFactory itemProdutoFactory;

    public CupomFiscal fabricate(String codigo, String loginCliente) {
        NfeResponseDTO nfeResponseDTO = serproService.getNfe(codigo);
        NfeProcDTO nfeProc = nfeResponseDTO.getNfeProc();
        InfNfeDTO infNfeDTO = nfeProc.getNFe().getInfNFe();
        List<ItemProduto> itens =  infNfeDTO.getDet().stream().map(itemProdutoFactory::fabricate).toList();
        return CupomFiscal.builder()
                .parceiro(parceiroService.sincronizar(ParceiroBuilder.fromNfe(nfeResponseDTO)))
                .cliente(clienteService.sincronizar(loginCliente))
                .codigo(String.valueOf(nfeProc.getProtNFe().getInfProt().getChNFe()))
                .itensProduto(itens)
                .valorTotal(itens.stream().mapToDouble(ItemProduto::getValorUnitario).sum())
                .quantidadeTotal(itens.stream().mapToDouble(ItemProduto::getQuantidade).sum())
                .build();
    }

}
