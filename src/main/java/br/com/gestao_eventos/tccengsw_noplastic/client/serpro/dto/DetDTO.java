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
public class DetDTO {

    @JsonProperty
    private int nItem;

    @JsonProperty
    private ProdDTO prod;

}
