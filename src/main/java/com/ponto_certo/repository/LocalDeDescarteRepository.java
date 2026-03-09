package com.ponto_certo.repository;

import com.ponto_certo.domain.LocalDeDescarte;
import com.ponto_certo.domain.enums.Itens;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocalDeDescarteRepository extends JpaRepository<LocalDeDescarte, Long> {
    List<LocalDeDescarte> findByItensContaining(Itens item);
    List<LocalDeDescarte> findByEndereco_Cidade(String cidade);
    List<LocalDeDescarte> findByEndereco_CidadeAndItensContaining(String cidade, Itens item);
    List<LocalDeDescarte> findByFazColetaTrue();
}
