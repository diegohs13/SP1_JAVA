package com.example.sprint1java.domain.exame;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.*;

@Table(name = "tb_exame")
@Entity(name = "Exame")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Exame {
    @Id
    @Column(name = "id_exame")
    private int id_exame;

    @Column(name = "tipo_exame")
    private String tipo_exame;

    @Column(name = "resultado")
    private String resultado;
}
