package com.ponto_certo.DTO;

import org.springframework.web.multipart.MultipartFile;

public class DenunciaDTO {
    private String cidade;

    private String endereco;

    private String descricao;

    private MultipartFile anexo;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public MultipartFile getAnexo() {
        return anexo;
    }

    public void setAnexo(MultipartFile anexo) {
        this.anexo = anexo;
    }
}
