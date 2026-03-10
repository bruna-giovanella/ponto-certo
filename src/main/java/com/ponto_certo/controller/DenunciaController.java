package com.ponto_certo.controller;

import com.ponto_certo.DTO.DenunciaDTO;
import com.ponto_certo.service.DenunciaService;
import jakarta.mail.MessagingException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/denuncia")
public class DenunciaController {

    private final DenunciaService denunciaService;

    public DenunciaController(DenunciaService denunciaService) {
        this.denunciaService = denunciaService;
    }

    @GetMapping("/cidades")
    public ResponseEntity<List<String>> findCidades() {
        return ResponseEntity.ok(denunciaService.findCidades());
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Void> enviarDenuncia(@ModelAttribute DenunciaDTO dto) throws MessagingException {
        denunciaService.enviarDenuncia(dto);
        return ResponseEntity.ok().build();
    }
}
