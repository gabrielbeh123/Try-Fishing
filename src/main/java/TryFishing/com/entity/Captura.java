package TryFishing.com.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_capturas")
@Data
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
}