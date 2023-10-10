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
public class InfProtDTO {

    @JsonProperty
    private long nProt;

    @JsonProperty
    private String digVal;

    @JsonProperty
    private String dhRecbto;

    @JsonProperty
    private String chNFe;

    @JsonProperty
    private String xMotivo;

    @JsonProperty
    private int cStat;

}
