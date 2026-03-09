package com.ponto_certo.DTO;

import com.ponto_certo.domain.enums.Itens;

import java.time.LocalDate;

public class SolicitacaoColetaDTO {
    private Itens categoriaDoItem;

    private String identificacaoDoItem;

    private Long responsavelColetaId;

    private LocalDate dataParaColeta;

    private String emailPessoal;

    public Itens getCategoriaDoItem() {
        return categoriaDoItem;
    }

    public void setCategoriaDoItem(Itens categoriaDoItem) {
        this.categoriaDoItem = categoriaDoItem;
    }

    public String getIdentificacaoDoItem() {
        return identificacaoDoItem;
    }

    public void setIdentificacaoDoItem(String identificacaoDoItem) {
        this.identificacaoDoItem = identificacaoDoItem;
    }

    public Long getResponsavelColetaId() {
        return responsavelColetaId;
    }

    public void setResponsavelColetaId(Long responsavelColetaId) {
        this.responsavelColetaId = responsavelColetaId;
    }

    public LocalDate getDataParaColeta() {
        return dataParaColeta;
    }

    public void setDataParaColeta(LocalDate dataParaColeta) {
        this.dataParaColeta = dataParaColeta;
    }

    public String getEmailPessoal() {
        return emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }
}
