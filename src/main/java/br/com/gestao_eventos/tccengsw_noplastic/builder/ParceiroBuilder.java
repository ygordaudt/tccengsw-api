package br.com.gestao_eventos.tccengsw_noplastic.builder;

import br.com.gestao_eventos.tccengsw_noplastic.client.serpro.dto.EmitDTO;
import br.com.gestao_eventos.tccengsw_noplastic.client.serpro.dto.EnderEmitDTO;
import br.com.gestao_eventos.tccengsw_noplastic.client.serpro.dto.InfNfeDTO;
import br.com.gestao_eventos.tccengsw_noplastic.client.serpro.dto.NfeResponseDTO;
import br.com.gestao_eventos.tccengsw_noplastic.model.Parceiro;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ParceiroBuilder {

    public static Parceiro fromNfe(NfeResponseDTO nfeDTO) {
        InfNfeDTO infNfeDTO = nfeDTO.getNfeProc().getNFe().getInfNFe();
        EmitDTO emitDTO = infNfeDTO.getEmit();
        EnderEmitDTO enderEmitDTO = emitDTO.getEnderEmit();
        Parceiro parceiro = Parceiro.builder()
                .nome(emitDTO.getXNome())
                .cnpj(emitDTO.getCNPJ())
                .cidade(enderEmitDTO.getXMun())
                .estado(enderEmitDTO.getUF())
                .email(emitDTO.getXFant())
                .telefone(String.valueOf(enderEmitDTO.getFone()))
                .build();
        parceiro.setMatriz(parceiro);
        return parceiro;
    }

}
