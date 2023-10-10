package br.com.tccengsw_noplastic_api.repository;

import br.com.tccengsw_noplastic_api.model.ItemProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemProdutoRepository extends JpaRepository<ItemProduto, Long> {
}
