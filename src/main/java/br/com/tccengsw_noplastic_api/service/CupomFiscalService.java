package br.com.tccengsw_noplastic_api.service;

import br.com.tccengsw_noplastic_api.builder.CupomFiscalBuilder;
import br.com.tccengsw_noplastic_api.dto.CupomFiscalDTO;
import br.com.tccengsw_noplastic_api.factory.CupomFiscalFactory;
import br.com.tccengsw_noplastic_api.model.CupomFiscal;
import br.com.tccengsw_noplastic_api.repository.CupomFiscalRepository;
import br.com.tccengsw_noplastic_api.utils.MapUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

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

    public CupomFiscalDTO sincronizar(String codigo) {
        return mapUtils.mapObject(
                repository.save(factory.fabricate(codigo)),
                CupomFiscalDTO.class);
    }

    public void resetarCupons() {
        repository.deleteAll();
    }

    public List<String> buscarCuponsDisponiveis() {
        List<String> cuponsCadastrados = repository.findAll()
                .stream()
                .map(CupomFiscal::getCodigo)
                .toList();
        List<String> cuponsDisponiveis = new java.util.ArrayList<>(CupomFiscalBuilder.fromDisponiveisSerpro());
        cuponsDisponiveis.removeAll(cuponsCadastrados);
        return cuponsDisponiveis;
    }

}
