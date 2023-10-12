package br.com.tccengsw_noplastic_api.service;

import br.com.tccengsw_noplastic_api.dto.SolicitacaoCashbackDTO;
import br.com.tccengsw_noplastic_api.factory.SolicitacaoCashbackFactory;
import br.com.tccengsw_noplastic_api.repository.SolicitacaoCashbackRepository;
import br.com.tccengsw_noplastic_api.utils.MapUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

@Service
@RequiredArgsConstructor
public class SolicitacaoCashbackService {

    private final SolicitacaoCashbackRepository repository;
    private final SolicitacaoCashbackFactory factory;
    private final MapUtils mapUtils;

    public Page<SolicitacaoCashbackDTO> listar(Pageable pageable) {
        return mapUtils.mapPage(
                repository.findAll(
                        PageRequest.of(
                                pageable.getPageNumber(),
                                pageable.getPageSize())),
                SolicitacaoCashbackDTO.class);
    }

    public SolicitacaoCashbackDTO buscar(Long id) {
        return mapUtils.mapObject(
                repository.findById(id)
                        .orElseThrow(() -> new NotFoundException("Solicitação de cashback não encontrada")),
                SolicitacaoCashbackDTO.class);
    }

    public SolicitacaoCashbackDTO salvar(String codigoCupomFiscal, String loginUsuario) {
        return mapUtils.mapObject(
                repository.save(factory.fabricate(codigoCupomFiscal, loginUsuario)),
                SolicitacaoCashbackDTO.class);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public void reset() {
        repository.deleteAll();
    }

}
