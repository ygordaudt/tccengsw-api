package br.com.tccengsw_noplastic_api.controller;

import br.com.tccengsw_noplastic_api.dto.CupomFiscalDTO;
import br.com.tccengsw_noplastic_api.service.CupomFiscalService;
import lombok.RequiredArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cupom-fiscal")
public class CupomFiscalController {

    private final CupomFiscalService service;

    @GetMapping(produces = "application/json")
    public ResponseEntity<Page<CupomFiscalDTO>> listar(
            @NotNull @ParameterObject Pageable pageable) {
        return ResponseEntity.ok(service.listar(pageable));
    }

    @PostMapping(value = "/{nfeId}", produces = "application/json")
    public ResponseEntity<CupomFiscalDTO> sincronizar(
            @PathVariable @NotNull String nfeId,
            @RequestHeader @NotNull String loginCliente) {
        return ResponseEntity.ok(service.sincronizar(nfeId, loginCliente));
    }

    @GetMapping(value = "/disponivel", produces = "application/json")
    public ResponseEntity<List<String>> listarDisponiveis() {
        return ResponseEntity.ok(service.buscarCuponsDisponiveis());
    }

    @PostMapping("/reset")
    public ResponseEntity<Void> resetarCupons() {
        service.resetarCupons();
        return ResponseEntity.noContent().build();
    }

}
