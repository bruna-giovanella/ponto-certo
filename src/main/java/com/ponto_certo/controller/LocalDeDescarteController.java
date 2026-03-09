package com.ponto_certo.controller;

import com.ponto_certo.domain.LocalDeDescarte;
import com.ponto_certo.domain.enums.Itens;
import com.ponto_certo.service.LocalDeDescarteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locais-de-descarte")
public class LocalDeDescarteController {

    private LocalDeDescarteService localDeDescarteService;

    public LocalDeDescarteController(LocalDeDescarteService localDeDescarteService) {
        this.localDeDescarteService = localDeDescarteService;
    }

    @GetMapping
    public ResponseEntity<List<LocalDeDescarte>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(localDeDescarteService.findAll());
    }

    @GetMapping("/por-item")
    public ResponseEntity<List<LocalDeDescarte>> findByItem(@RequestParam Itens item) {
        return ResponseEntity.status(HttpStatus.OK).body(localDeDescarteService.findByItem(item));
    }

    @GetMapping("/por-cidade")
    public ResponseEntity<List<LocalDeDescarte>> findByCidade(@RequestParam String cidade) {
        return ResponseEntity.status(HttpStatus.OK).body(localDeDescarteService.findByCidade(cidade));
    }

    @GetMapping("/por-cidade-e-item")
    public ResponseEntity<List<LocalDeDescarte>> findByCidadeAndItem(@RequestParam String cidade, Itens item) {
        return ResponseEntity.status(HttpStatus.OK).body(localDeDescarteService.findByCidadeAndItem(cidade, item));
    }

    @GetMapping("/{id}")
    public ResponseEntity<LocalDeDescarte> findById(@PathVariable(name="id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(localDeDescarteService.findById(id));
    }
}
