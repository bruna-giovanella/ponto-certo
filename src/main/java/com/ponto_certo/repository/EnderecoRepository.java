package com.ponto_certo.repository;

import com.ponto_certo.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    @Query("SELECT DISTINCT e.cidade FROM Endereco e ORDER BY e.cidade")
    List<String> findDistinctCidades();
}