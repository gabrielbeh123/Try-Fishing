package TryFishing.com.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_especies")
@Data
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
}