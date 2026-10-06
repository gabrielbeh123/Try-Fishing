package TryFishing.com.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_equipamentos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipo;

    private String marca;
    private String modelo;
    private String especificacoes;
}