package com.ponto_certo.domain;

import com.ponto_certo.domain.enums.Itens;
import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.ArrayList;

@Entity
@Table(name="locais_de_descarte")
public class LocalDeDescarte {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long localDeDescarteId;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    private LocalTime horaInicio;

    private LocalTime horaFim;

    private boolean aberto;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "locais_de_descarte_itens", joinColumns = @JoinColumn(name = "local_id"))
    @Column(name = "item")
    private ArrayList<Itens> itens;

    private boolean fazColeta;

    public Long getLocalDeDescarteId() {
        return localDeDescarteId;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public ArrayList<Itens> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Itens> itens) {
        this.itens = itens;
    }

    public boolean isFazColeta() {
        return fazColeta;
    }

    public void setFazColeta(boolean fazColeta) {
        this.fazColeta = fazColeta;
    }
}
