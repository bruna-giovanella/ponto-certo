package com.ponto_certo.service;

import com.ponto_certo.domain.Endereco;
import com.ponto_certo.domain.LocalDeDescarte;
import com.ponto_certo.domain.enums.Itens;
import com.ponto_certo.repository.EnderecoRepository;
import com.ponto_certo.repository.LocalDeDescarteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalDeDescarteService {

    private final LocalDeDescarteRepository localDeDescarteRepository;
    private final EnderecoRepository enderecoRepository;

    public LocalDeDescarteService(LocalDeDescarteRepository localDeDescarteRepository, EnderecoRepository enderecoRepository) {
        this.localDeDescarteRepository = localDeDescarteRepository;
        this.enderecoRepository = enderecoRepository;
    }

    public List<LocalDeDescarte> findAll() {
        return localDeDescarteRepository.findAll();
    }

    public List<LocalDeDescarte> findByItem(Itens item) {
        return localDeDescarteRepository.findByItensContaining(item);
    }

    public List<LocalDeDescarte> findByCidade(String cidade) {
        return localDeDescarteRepository.findByEndereco_Cidade(cidade);
    }

    public List<LocalDeDescarte> findByCidadeAndItem(String cidade, Itens item) {
        return localDeDescarteRepository.findByEndereco_CidadeAndItensContaining(cidade, item);
    }

    public LocalDeDescarte findById(Long id) {
        return localDeDescarteRepository.findById(id).orElse(null);
    }
}
