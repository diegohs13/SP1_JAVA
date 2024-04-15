package com.example.sprint1java.domain.agendamento;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.*;

@Table(name = "tb_agendamento")
@Entity(name = "Agendamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agendamento {
    @Id
    @Column(name = "n_protocolo")
    private int n_protocolo;

    @Column(name = "data_hora_agendamento")
    private String data_hora_agendamento;
}