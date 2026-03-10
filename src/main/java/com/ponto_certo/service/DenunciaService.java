package com.ponto_certo.service;

import com.ponto_certo.DTO.DenunciaDTO;
import com.ponto_certo.DTO.SolicitacaoColetaDTO;
import com.ponto_certo.domain.Endereco;
import com.ponto_certo.domain.LocalDeDescarte;
import com.ponto_certo.repository.EnderecoRepository;
import jakarta.mail.MessagingException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DenunciaService {

    private final EmailService emailService;
    private final EnderecoRepository enderecoRepository;

    public DenunciaService(EmailService emailService, EnderecoRepository enderecoRepository) {
        this.emailService = emailService;
        this.enderecoRepository = enderecoRepository;
    }

    public List<String> findCidades() {
        return enderecoRepository.findDistinctCidades();
    }

    public void enviarDenuncia(DenunciaDTO dto) throws MessagingException {
        String corpo = """
                Prezados,

                Uma nova denúncia de descarte indevido foi registrada na plataforma Ponto Certo.

                Informações da denúncia:
                - Cidade: %s
                - Endereço: %s
                - Descrição: %s

                Pedimos que as medidas cabíveis sejam tomadas.

                Atenciosamente,
                Equipe Ponto Certo
                """.formatted(
                dto.getCidade(),
                dto.getEndereco(),
                dto.getDescricao()
        );

        emailService.enviarEmailComAnexo("Denúncia de Descarte Indevido", corpo, dto.getAnexo());
    }

}
