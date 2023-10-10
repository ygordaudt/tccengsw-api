package br.com.tccengsw_noplastic_api.builder;

import br.com.tccengsw_noplastic_api.model.Cliente;
import br.com.tccengsw_noplastic_api.model.ContaBancaria;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ClienteBuilder {

    public static Cliente newDefault(String loginCliente) {
        return Cliente.builder()
                .cpf("11111111111")
                .email("cliente@email.com")
                .cidade("Cidade")
                .estado("UF")
                .nome("Cliente Tal")
                .login(loginCliente)
                .password("123")
                .telefone("99999999999")
                .contaBancaria(ContaBancaria.builder()
                        .numeroBanco("12")
                        .numeroAgencia("1234")
                        .numeroConta("123456")
                        .chavePIX("chavepix")
                        .build())
                .build();
    }

}
