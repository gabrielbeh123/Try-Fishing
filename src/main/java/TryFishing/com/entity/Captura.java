package TryFishing.com.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_capturas")
@NoArgsConstructor
@AllArgsConstructor
public class Captura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dataHora;

    private Double pesoKg;
    private Double comprimentoCm;
    private Boolean pesqueESolte;

    private String iscaUtilizada;
    private String condicoesClimaticas;
    private String fotoUrl;

    @ManyToOne
    @JoinColumn(name = "local_id", nullable = false)
    private LocalDePesca local;

    @ManyToOne
    @JoinColumn(name = "especie_id", nullable = false)
    private Especie especie;

    @ManyToOne
    @JoinColumn(name = "equipamento_id")
    private Equipamento equipamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Double getComprimentoCm() {
        return comprimentoCm;
    }

    public void setComprimentoCm(Double comprimentoCm) {
        this.comprimentoCm = comprimentoCm;
    }

    public Boolean getPesqueESolte() {
        return pesqueESolte;
    }

    public void setPesqueESolte(Boolean pesqueESolte) {
        this.pesqueESolte = pesqueESolte;
    }

    public String getIscaUtilizada() {
        return iscaUtilizada;
    }

    public void setIscaUtilizada(String iscaUtilizada) {
        this.iscaUtilizada = iscaUtilizada;
    }

    public String getCondicoesClimaticas() {
        return condicoesClimaticas;
    }

    public void setCondicoesClimaticas(String condicoesClimaticas) {
        this.condicoesClimaticas = condicoesClimaticas;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public LocalDePesca getLocal() {
        return local;
    }

    public void setLocal(LocalDePesca local) {
        this.local = local;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
}