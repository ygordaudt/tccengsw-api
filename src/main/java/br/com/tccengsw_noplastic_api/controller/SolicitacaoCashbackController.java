package br.com.tccengsw_noplastic_api.controller;

import br.com.tccengsw_noplastic_api.dto.SolicitacaoCashbackDTO;
import br.com.tccengsw_noplastic_api.service.SolicitacaoCashbackService;
import br.com.tccengsw_noplastic_api.validator.CupomJaCadastradoValidator;
import br.com.tccengsw_noplastic_api.validator.SolicitacaoCashbackJaConcluidaValidator;
import lombok.RequiredArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/solicitacao-cashback")
public class SolicitacaoCashbackController {

    private final SolicitacaoCashbackService service;
    private final CupomJaCadastradoValidator cupomJaCadastradoValidator;
    private final SolicitacaoCashbackJaConcluidaValidator solicitacaoCashbackJaConcluidaValidator;

    @GetMapping
    public ResponseEntity<Page<SolicitacaoCashbackDTO>> listar(
            @NotNull @ParameterObject Pageable pageable) {
        return ResponseEntity.ok(service.listar(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SolicitacaoCashbackDTO> buscar(
            @NotNull @PathVariable Long id) {
        return ResponseEntity.ok(service.buscar(id));
    }

    @PostMapping("/cupom-fiscal/{codigoCupomFiscal}")
    public ResponseEntity<SolicitacaoCashbackDTO> criar(
            @PathVariable @NotNull String codigoCupomFiscal,
            @RequestHeader @NotNull String loginCliente) {
        cupomJaCadastradoValidator.validate(codigoCupomFiscal);
        return ResponseEntity.ok(service.salvar(codigoCupomFiscal, loginCliente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(
            @NotNull @PathVariable Long id) {
        solicitacaoCashbackJaConcluidaValidator.validate(id);
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/reset")
    public ResponseEntity<Void> reset() {
        service.reset();
        return ResponseEntity.noContent().build();
    }

}
