package br.com.tccengsw_noplastic_api.controller;

import br.com.tccengsw_noplastic_api.service.CupomFiscalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cupom-fiscal")
public class CupomFiscalController {

    private final CupomFiscalService service;

    @GetMapping(value = "/serpro/disponivel")
    public ResponseEntity<List<String>> listarDisponiveis() {
        return ResponseEntity.ok(service.buscarCuponsDisponiveis());
    }

}
