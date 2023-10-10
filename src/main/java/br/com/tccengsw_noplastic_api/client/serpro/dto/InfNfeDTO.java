package br.com.tccengsw_noplastic_api.client.serpro.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class InfNfeDTO {

    @JsonProperty
    private List<DetDTO> det;

    @JsonProperty
    private String Id;

    @JsonProperty
    private EmitDTO emit;

}
