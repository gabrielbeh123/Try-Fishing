package TryFishing.com.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_especies")
@NoArgsConstructor
@AllArgsConstructor
public class Especie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nomePopular;

    private String nomeCientifico;
    private Double tamanhoMinimoAbateCm;
    private String epocaDefeso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public Double getTamanhoMinimoAbateCm() {
        return tamanhoMinimoAbateCm;
    }

    public void setTamanhoMinimoAbateCm(Double tamanhoMinimoAbateCm) {
        this.tamanhoMinimoAbateCm = tamanhoMinimoAbateCm;
    }

    public String getEpocaDefeso() {
        return epocaDefeso;
    }

    public void setEpocaDefeso(String epocaDefeso) {
        this.epocaDefeso = epocaDefeso;
    }
}