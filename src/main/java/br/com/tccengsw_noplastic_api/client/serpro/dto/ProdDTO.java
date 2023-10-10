package br.com.tccengsw_noplastic_api.client.serpro.dto;

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
public class ProdDTO {

    @JsonProperty
    private String cEAN;

    @JsonProperty
    private String cProd;

    @JsonProperty
    private double qCom;

    @JsonProperty
    private String cEANTrib;

    @JsonProperty
    private double vUnTrib;

    @JsonProperty
    private double qTrib;

    @JsonProperty
    private double vProd;

    @JsonProperty
    private String xProd;

    @JsonProperty
    private double vUnCom;

    @JsonProperty
    private int indTot;

    @JsonProperty
    private String uTrib;

    @JsonProperty
    private long NCM;

    @JsonProperty
    private String uCom;

    @JsonProperty
    private int CFOP;

    @JsonProperty
    private long CEST;

}
