package br.com.tccengsw_noplastic_api.model;

import br.com.tccengsw_noplastic_api.model.commons.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
public class SolicitacaoCashback extends BaseEntity {

    @OneToOne
    @JoinColumn
    private CupomFiscal cupomFiscal;

    @ManyToOne
    @JoinColumn
    private Cliente cliente;

    @ManyToOne
    @JoinColumn
    private OrdemPagamentoCashback ordemPagamentoCashback;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @Builder.Default
    private List<AtividadeHistoricoSolicitacaoCashback> atividadesHistorico = new ArrayList<>();

}
