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
public class NfeProcDTO {

    @JsonProperty
    private NfeDTO NFe;

    @JsonProperty
    private ProtNfeDTO protNFe;

}
