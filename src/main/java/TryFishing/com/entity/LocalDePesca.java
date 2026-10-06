package TryFishing.com.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_locais")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalDePesca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String tipo;

    private String cidade;
    private String estado;

    private Double latitude;
    private Double longitude;

    @Column(length = 500)
    private String observacoes;
}