package br.com.gestao_eventos.tccengsw_noplastic.service;

import br.com.gestao_eventos.tccengsw_noplastic.dto.CupomFiscalDTO;
import br.com.gestao_eventos.tccengsw_noplastic.factory.CupomFiscalFactory;
import br.com.gestao_eventos.tccengsw_noplastic.model.CupomFiscal;
import br.com.gestao_eventos.tccengsw_noplastic.repository.CupomFiscalRepository;
import br.com.gestao_eventos.tccengsw_noplastic.utils.MapUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

@Service
@RequiredArgsConstructor
public class CupomFiscalService {

    private final CupomFiscalRepository repository;
    private final CupomFiscalFactory factory;
    private final MapUtils mapUtils;

    public Page<CupomFiscalDTO> listar(Pageable pageable) {
        return mapUtils.mapPage(
                repository.findAll(
                        PageRequest.of(
                                pageable.getPageNumber(),
                                pageable.getPageSize())),
                CupomFiscalDTO.class);
    }

    public CupomFiscal buscar(String codigo) {
        return repository.findByCodigo(codigo)
                .orElseThrow(() -> new NotFoundException("Cupom fiscal não encontrado"));
    }

    public CupomFiscalDTO sincronizar(String codigo, String loginCliente) {
        repository.findByCodigo(codigo).ifPresent(repository::delete);
        return mapUtils.mapObject(
                repository.save(factory.fabricate(codigo, loginCliente)),
                CupomFiscalDTO.class);
    }

    public void resetarCupons() {
        repository.deleteAll();
    }

}
