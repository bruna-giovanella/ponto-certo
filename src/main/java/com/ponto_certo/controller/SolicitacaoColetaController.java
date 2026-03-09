package com.ponto_certo.controller;

import com.ponto_certo.DTO.SolicitacaoColetaDTO;
import com.ponto_certo.domain.LocalDeDescarte;
import com.ponto_certo.service.SolicitacaoDeColetaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitacao-coleta")
public class SolicitacaoColetaController {

    private final SolicitacaoDeColetaService solicitacaoDeColetaService;

    public SolicitacaoColetaController(SolicitacaoDeColetaService solicitacaoDeColetaService) {
        this.solicitacaoDeColetaService = solicitacaoDeColetaService;
    }

    @GetMapping("/responsaveis")
    public ResponseEntity<List<LocalDeDescarte>> findResponsaveis() {
        return ResponseEntity.status(HttpStatus.OK).body(solicitacaoDeColetaService.findResponsaveis());
    }

    @PostMapping
    public ResponseEntity<Void> enviarSolicitacao(@RequestBody SolicitacaoColetaDTO dto) {
        solicitacaoDeColetaService.enviarSolicitacao(dto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
