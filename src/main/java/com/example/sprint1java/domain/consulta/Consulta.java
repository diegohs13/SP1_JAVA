package com.example.sprint1java.domain.consulta;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.*;

@Table(name = "tb_consultas")
@Entity(name = "Consulta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Consulta {
    @Id
    @Column(name = "id_unidade")
    private int id_unidade;

    @Column(name = "data_hora_consultas")
    private String data_hora_consultas;
}
