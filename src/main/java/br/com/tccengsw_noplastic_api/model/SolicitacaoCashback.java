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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private CupomFiscal cupomFiscal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private OrdemPagamentoCashback ordemPagamentoCashback;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "solicitacao_cashback_id")
    @Builder.Default
    private List<AtividadeHistoricoSolicitacaoCashback> atividadesHistorico = new ArrayList<>();

}
