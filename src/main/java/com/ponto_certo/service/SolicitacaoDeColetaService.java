package com.ponto_certo.service;

import com.ponto_certo.DTO.SolicitacaoColetaDTO;
import com.ponto_certo.domain.LocalDeDescarte;
import com.ponto_certo.repository.LocalDeDescarteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitacaoDeColetaService {

    private final LocalDeDescarteRepository localDeDescarteRepository;
    private final EmailService emailService;

    public SolicitacaoDeColetaService(LocalDeDescarteRepository localDeDescarteRepository, EmailService emailService) {
        this.localDeDescarteRepository = localDeDescarteRepository;
        this.emailService = emailService;
    }

    public List<LocalDeDescarte> findResponsaveis() {
        return localDeDescarteRepository.findByFazColetaTrue();
    }

    public void enviarSolicitacao(SolicitacaoColetaDTO dto) {
        LocalDeDescarte responsavel = localDeDescarteRepository.findById(dto.getResponsavelColetaId())
                .orElseThrow(() -> new RuntimeException("Local de descarte não encontrado"));

        String corpo = """
                Prezados,
                
                Encaminhamos, abaixo, uma solicitação de coleta de item de resíduo realizada por um terceiro. Informamos que atuamos apenas como intermediários no encaminhamento desta demanda ao responsável pela coleta.
                
                Informações da solicitação:
                - Categoria do item: %s
                - Identificação do item: %s
                - Data solicitada para coleta: %s
                - E-mail do solicitante: %s
                
                Solicitamos, por gentileza, a verificação da possibilidade de atendimento da coleta na data informada.
                Caso seja necessário alinhar detalhes adicionais, informações logísticas ou quaisquer ajustes, pedimos que o contato seja realizado diretamente com o solicitante, por meio do e-mail informado acima.
                
                Desde já agradecemos pela atenção.
                Atenciosamente,
                Equipo Ponto Certo
                """.formatted(
                        dto.getCategoriaDoItem(),
                        dto.getIdentificacaoDoItem(),
                        dto.getDataParaColeta(),
                        dto.getEmailPessoal()
        );

        emailService.enviarEmail(responsavel.getEmail(), "Solicitação de Coleta", corpo);
    }
}
