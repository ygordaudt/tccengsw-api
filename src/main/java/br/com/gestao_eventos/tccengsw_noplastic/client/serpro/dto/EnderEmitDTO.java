package br.com.gestao_eventos.tccengsw_noplastic.client.serpro.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class EnderEmitDTO {

    @JsonProperty
    private Long fone;

    @JsonProperty
    private String UF;

    @JsonProperty
    private String xPais;

    @JsonProperty
    private Long cPais;

    @JsonProperty
    private String xLgr;

    @JsonProperty
    private String xMun;

    @JsonProperty
    private String nro;

    @JsonProperty
    private Long cMun;

    @JsonProperty
    private String xBairro;

    @JsonProperty
    private String CEP;

}
